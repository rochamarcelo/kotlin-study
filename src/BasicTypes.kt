
fun mainBasicTypes() {
    println("Hello World!")

    val popcornd = 5;//val means read-only variable
    val hotdog = 7;
    var customers = 10; //normal variable, it can be changed
    //We recommend that you declare all variables as read-only
    // (val) by default. Declare mutable variables (var) only if necessary.
    println(debug);
    println("There are $customers customers");
    customers = 8;
    println("There are $customers customers");
    customers = customers + 3;
    println("There are $customers customers");
    customers += 7;
    println("There are $customers customers");
    customers -= 3;
    println("There are $customers customers");
    customers *= 2;
    println("There are $customers customers");
    customers /= 3;
    println("There are ${customers + 1} customers");
    //+=, -=, *=, /=, and %= are augmented assignment operators. For more information, see Augmented assignments.

    //Typed variables
    val year: Int = 2025;
    val scope: UInt = 100u;
    val currentTemp: Float = 24.5f;
    val price: Double = 19.99;
    val isEnabled:  Boolean = true;
    val separator: Char = ',';
    val message: String = "Hello, World";
    val name: String = "Marcelo";
    val greetings = "Hello $name";
    println(message);
    println(greetings);
    // Variable declared without initialization
    val day: Int;
    if (customers > 10) {
        day = 25;
    } else {
        day = 30;
    }
    println("Day: $day");

    //If you don't initialize a variable before it is read, you see an error:
    val d: Int
// Triggers an error: Kotlin: Variable 'd' must be initialized.
//    println(d); //uncomment this to see the error

}

fun basicTypesExercise() {
    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000_000
    val e: Boolean = false
    val f: Char = '\n'
}