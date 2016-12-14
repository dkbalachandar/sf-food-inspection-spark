Spark job to analysis the SF Food inspection data and filter the records and put the data into Mongo DB.

Run the below command to start the spark job

 bin/spark-submit --class com.spark.SFFoodInspectionAnalysis --master local sf-food-inspection-spark-assembly-1.0.jar
      file:///usr/local/spark/Food_Inspections_-_LIVES_Standard.csv

I have got the data set from https://data.sfgov.org/Health-and-Social-Services/Food-Inspections-LIVES-Standard. Access this link and download it

