// Class & Constructors

class Batman(val alterEgo: String) {
  def themeSong() = "DA NA NA NA NA NA, BATMAN!"
  override def toString =
    s"BATMAN is aka as $alterEgo"
}

val bman = new Batman("Bruce Wayne")
bman.themeSong()
bman.alterEgo


// primary constructor scope demo
class Person(var firstName: String, var lastName: String) {

  println("the constructor begins")

  // some class fields
  private val HOME = System.getProperty("user.home")
  var age = 0

  // some methods
  override def toString = s"$firstName $lastName is $age years old"
  def printHome() { println(s"HOME = $HOME") }
  def printFullName() { println(this) }  // uses toString

  printHome()
  printFullName()
  println("still in the constructor")

}

val perosn = new Person("sean", "glover")

// Case classes

case class Superhero(name: String, sidekick: String) // no body

val greenHornet = Superhero("Green Hornet", "Kato")

greenHornet match {
  case Superhero(_, sidekick) => sidekick
}

// Objects

// companion object used as factory
object Scalator {
  def apply(events: Seq[String]) = new Scalator(events)
}

class Scalator(events: Seq[String]) {
  override def toString =
    s"Scalator events: ${events.mkString(", ")}"
}

Scalator(Seq("Why scala?", "Scala Fundamentals", "Collections"))



