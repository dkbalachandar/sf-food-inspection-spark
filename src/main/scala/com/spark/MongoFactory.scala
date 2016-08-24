package com.spark

/**
 * Created by byk29 on 8/23/16.
 */

import com.mongodb.casbah.MongoConnection
import com.stratio.datasource.mongodb.config.MongodbConfig._
import com.stratio.datasource.mongodb.config.MongodbConfigBuilder

object MongoFactory {
  private val SERVER = "localhost"
  private val PORT = 27017
  private val DATABASE = "sffood"
  private val COLLECTION = "foodinspection"

  val saveConfig = MongodbConfigBuilder(Map(Host -> List(SERVER),
    Database -> DATABASE, Collection -> COLLECTION, SamplingRatio -> 1.0, WriteConcern -> "normal", SplitSize -> 8, SplitKey -> "_id"))

}
