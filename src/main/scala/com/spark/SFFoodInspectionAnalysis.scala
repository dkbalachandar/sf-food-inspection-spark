package com.spark

import com.stratio.datasource.mongodb._
import org.apache.spark.sql.SQLContext
import org.apache.spark.{SparkConf, SparkContext}

object SFFoodInspectionAnalysis {

  def main(args: Array[String]) {

    if (args.length < 1) {
      /*
      Run as below
      bin/spark-submit --class com.spark.SFFoodInspectionAnalysis --master local sf-food-inspection-spark-assembly-1.0.jar
      file:///usr/local/spark/food_inspections.csv

      */
      println("Usage inputFile")
      return
    }

    val conf = new SparkConf().setAppName("SF-FOOD-ANALYSIS")
    //Scala Spark Context.
    val sc = new SparkContext(conf)

    //Create the SQL context
    val sqlContext = new SQLContext(sc)

    //Load the CSV data
    val df = sqlContext.read
      .format("com.databricks.spark.csv")
      .option("header", "true")
      .option("inferSchema", "true")
      .load(args(0))

    df.printSchema()
    df.columns.foreach(println)

    df.registerTempTable("food_inspections")

    //Then filter with name and output the data to mongodb
    val allInspections = df.select("business_id", "business_name", "violation_description", "risk_category")

    allInspections.saveToMongodb(MongoFactory.saveAllConfig.build)

    val filterInspections = sqlContext.sql("SELECT business_name, risk_category, count(*) as count FROM food_inspections where risk_category in ('High Risk', 'Low Risk','Moderate Risk') group by business_name, risk_category")

    filterInspections.saveToMongodb(MongoFactory.saveFilterConfig.build)

    sc.stop()
  }
}
