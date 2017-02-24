package com.paluchj.polar2endo

import org.slf4j.{Logger, LoggerFactory}

/**
  * Created by janusz on 24/02/2017.
  */
object App {
  private val LOGGER: Logger = LoggerFactory.getLogger(App.getClass)
  def main(args: Array[String]): Unit = {
    LOGGER.info("Start App with args: {}", args.mkString )

  }
}
