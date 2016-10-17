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
  private val DATABASE = "sfFood"
  private val ALL_COLLECTION = "allFoodInspection"
  private val FILTER_COLLECTION = "filterFoodInspection"

  val saveAllConfig = MongodbConfigBuilder(Map(Host -> List(SERVER),
    Database -> DATABASE, Collection -> ALL_COLLECTION, SamplingRatio -> 1.0, WriteConcern -> "normal", SplitSize -> 8, SplitKey -> "_id"))

  val saveFilterConfig = MongodbConfigBuilder(Map(Host -> List(SERVER),
    Database -> DATABASE, Collection -> FILTER_COLLECTION, SamplingRatio -> 1.0, WriteConcern -> "normal", SplitSize -> 8, SplitKey -> "_id"))

}
