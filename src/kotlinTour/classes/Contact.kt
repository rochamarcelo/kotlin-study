package kotlinTour.classes

class Contact (val id: Int, var email: String = "example@example.com") {
    val category: String = "work";

    fun printId() {
        println(id);
    }
}