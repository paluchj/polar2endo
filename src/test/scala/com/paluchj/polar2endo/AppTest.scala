package com.paluchj.polar2endo

import org.scalatest.{FunSpec, GivenWhenThen, Matchers}

/**
  * Created by janusz on 24/02/2017.
  */
class AppTest extends FunSpec with GivenWhenThen with Matchers {

  describe("App tests") {
    it("Should test something") {
      Given("Given something")
      val args = Array("--some", "value")

      When("Something happen")
      val result = args.length

      Then("Result should be fine")
      result shouldBe 2
    }

  }

}
