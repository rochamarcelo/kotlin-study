package practice.movieTicketPrice

fun main() {
    val child = 5
    val adult = 28
    val senior = 87
    val tooHighAge = 101;
    val tooLowAge = -1;


    var isMonday = true
    println("Prices on monday");
    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
    println("The movie ticket price for a person aged $tooHighAge is \$${ticketPrice(tooHighAge, isMonday)}.")
    println("The movie ticket price for a person aged $tooLowAge is \$${ticketPrice(tooLowAge, isMonday)}.")

    isMonday = false;
    println("Prices other days");
    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
    println("The movie ticket price for a person aged $tooHighAge is \$${ticketPrice(tooHighAge, isMonday)}.")
    println("The movie ticket price for a person aged $tooLowAge is \$${ticketPrice(tooLowAge, isMonday)}.")

}

fun ticketPriceStandard (isMonday: Boolean): Int {
    if (isMonday) {
        return 25;
    }

    return 30;
}
fun ticketPrice(age: Int, isMonday: Boolean): Int {
    val price = when(age) {
        in 0..12 -> 15
        in 13..60 -> ticketPriceStandard(isMonday)
        in 61..100 -> 20
        else -> -1
    }

    return price;
}