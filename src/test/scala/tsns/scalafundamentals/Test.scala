package tsns.scalafundamentals

import org.scalatest.FreeSpec
import org.scalatest.Matchers._

class Test extends FreeSpec {

  "Values and variables" - {
    "iAmAlwaysFalse should exist" in {
      "println(tsns.scalafundamentals.iAmAlwaysFalse)" should compile
    }
    "iAmAlwaysFalse should be immutable" in {
      "tsns.scalafundamentals.iAmAlwaysFalse = true" shouldNot compile
    }
    "iCanBeFalseOrTrue can be reassigned" in {
      """
        |val now = tsns.scalafundamentals.iCanBeFalseOrTrue
        |tsns.scalafundamentals.iCanBeFalseOrTrue = !tsns.scalafundamentals.iCanBeFalseOrTrue
        |now !== tsns.scalafundamentals.iCanBeFalseOrTrue
      """.stripMargin should compile
    }
  }
  "Type inference" - {
    "myList should contain ints" in {
      myList(0) shouldBe a [java.lang.Integer]
    }
  }
  "Functions" - {
    "mean should return 1.5 given Seq(1, 2)" in {
      mean(Seq(1, 2)) shouldBe 1.5
    }
  }
  "Expressions" - {
    "mean should return -1 given empty list" in {
      mean(Seq.empty) shouldBe -1
    }
  }
  "Classes" - {
    "Batman should exist" in {
      "println(tsns.scalafundamentals.batman)" should compile
    }
    "Batman alterego should be private" in {
      "println(tsns.scalafundamentals.batman.name)" should compile
    }
    "Batman name should be public" in {
      "println(tsns.scalafundamentals.batman.alterego)" shouldNot compile
    }
  }
  "Case classes" - {
    "Superman should exist" in {
      "println(tsns.scalafundamentals.superman)" should compile
    }
    "Superman sequel number should be accessible" in {
      "println(tsns.scalafundamentals.superman.sequel)" should compile
    }
    "Superman can be created with actor name" in {
      """println(tsns.scalafundamentals.Superman(actorName = "Henry Cavill"))""" should compile
    }
  }
}
