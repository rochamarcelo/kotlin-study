var debug = true;//this is a top-level. Variables can be declared outside the main() function at the beginning of your program. Variables declared in this way are said to be declared at top level.
fun basicTypExercise() {
    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000_000
    val e: Boolean = false
    val f: Char = '\n'
}

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
fun main() {
    //Read only list
    val readOnlyShapes = listOf("triangle", "square", "circle");
    println(readOnlyShapes)

    //Mutable list with explicit type declaraation
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)
    //To prevent unwanted modifications, you can create a read-only view of a mutable list by assigning it to a List:
    //This is also called casting.
    val shapesLocked: List<String> = shapes;
    //Lists are ordered so to access an item in a list, use the indexed access operator []:
    println("The first item in the list is ${readOnlyShapes[0]}");
    println("The second item in the list is ${readOnlyShapes[1]}");
    //To get the first or last item in a list, use .first() and .last() functions respectively:
    println("The first item in the list is ${readOnlyShapes.first()}");
    println("The last item in the list is ${readOnlyShapes.last()}");
    //.first() and .last() functions are examples of extension functions.
    //To get the number of items in a list, use the .count() function:
    println("This list has ${readOnlyShapes.count()} items")
    //To check that an item is in a list, use the in operator
    println("circle" in readOnlyShapes);//true
    println("rectangle" in readOnlyShapes);//false
    //To add or remove items from a mutable list, use .add() and .remove() functions respectively:
    shapes.add("pentagon");
    println(shapes);
    shapes.remove("pentagon");
    println(shapes)


}