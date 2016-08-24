name := "sf-food-inspection-spark"

version := "1.0"

libraryDependencies ++= Seq("org.apache.spark" % "spark-core_2.10" % "1.6.1" % "provided",
                            "org.apache.spark" % "spark-streaming_2.10" % "1.6.1" % "provided",
                            "org.apache.spark" % "spark-mllib_2.10" % "1.3.0" % "provided",
                             "com.stratio.datasource" % "spark-mongodb_2.10" % "0.11.1",
                             "com.databricks" % "spark-csv_2.10" % "1.4.0" exclude("org.apache.commons","commons-csv"),
                             "org.apache.commons" % "commons-csv" % "1.4",
                             "org.apache.spark" % "spark-sql_2.10" % "1.6.1" % "provided")