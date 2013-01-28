package com.snowplowanalytics.hive.udf

import org.apache.hadoop.io.Text

import org.specs2._

class ToUpperSpec extends mutable.Specification {
  val toUpper = new ToUpper

  "ToUpper#evaluate" should {
    "return an empty string if passed a null value" in {
      toUpper.evaluate(null).toString mustEqual ""
    }

    "return a capitalised string if passed a mixed-case string" in {
      toUpper.evaluate(new Text("Stephen King")).toString mustEqual "STEPHEN KING"
    }
  }
}