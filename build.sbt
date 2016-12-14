name := "sf-food-inspection-spark"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq("org.apache.spark" % "spark-core_2.11" % "2.0.2" % "provided",
                            "org.apache.spark" % "spark-streaming_2.11" % "2.0.2" % "provided",
                            "org.apache.spark" % "spark-mllib_2.11" % "2.0.2" % "provided",
                             "com.stratio.datasource" % "spark-mongodb_2.11" % "0.12.0",
                             "com.databricks" % "spark-csv_2.11" % "1.5.0" exclude("org.apache.commons","commons-csv"),
                             "org.apache.commons" % "commons-csv" % "1.4",
                             "org.apache.spark" % "spark-sql_2.11" % "2.0.2" % "provided")