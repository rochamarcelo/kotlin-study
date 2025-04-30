package practice.internetProfile
fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    val johndoe = Person("John Doe", 30, null, null)
    val marydoe = Person("Mary Doe", 19, null, johndoe)
    val joe = Person("Joe Doe", 22, "play football", johndoe)

    amanda.showProfile()
    atiqah.showProfile()
    johndoe.showProfile();
    marydoe.showProfile();
    joe.showProfile();
}