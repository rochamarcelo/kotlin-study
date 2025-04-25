var debug = true;//this is a top-level. Variables can be declared outside the main() function at the beginning of your program. Variables declared in this way are said to be declared at top level.

fun main() {
    println(1..4);
    println(1..<4);
    println(4 downTo 1);
    println(1..5 step 2);
    println('a' ..'d');
    println('z' downTo 's' step 2);
    //loop into a range
    for (number in 1..5) {
        print(number);
    }
    println("...");
    //Collections can also be iterated over by loops:
    val cakes = listOf("carrot", "cheese", "chocolate");
    for (cake in cakes) {
        println("Yummy, it's a $cake cake!");
    }

    //while can be used in two ways:
    //1 - To execute a code block while a conditional expression is true. (while)
    var cakesEaten = 0;
    while (cakesEaten < 3) {
        println("Eat a cake");
        cakesEaten++;
    }
    //2 - To execute the code block first and then check the conditional expression. (do-while)
    var cakesBaked = 0;
    do {
        println("Bake a cake");
        cakesBaked++;
    } while(cakesBaked < cakesEaten);
}