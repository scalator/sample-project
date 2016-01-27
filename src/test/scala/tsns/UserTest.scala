package tsns

import org.scalatest.FlatSpec

class UserTest extends FlatSpec {

  "A User" should "return correct name" in {
    new User("Scalator").name === "Scalator"
  }

}
