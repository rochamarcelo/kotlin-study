import kotlin.random.Random

fun mainConditional() {
    //If you have to choose between if and when, we recommend using when because it:
    //
    // - Makes your code easier to read.
    // - Makes it easier to add another branch.
    // - Leads to fewer mistakes in your code.
    val d: Int;
    val check= true;
    if (check) {
        d = 1;
    } else {
        d = 2;
    }
    println(d);

    //There is no ternary operator condition ? then : else in Kotlin. Instead, if can be used as an expression. If there is only one line of code per action, the curly braces {} are optional:
    val a = 1;
    val b =  2;
    println(if (a > b) a else b);

    //Use when when you have a conditional expression with multiple branches.
    //Use -> in each branch to separate each check from the action to take if the check is successful.
    val obj = "Hello";
    when (obj) {
        "1" -> println("One");
        "Hello" -> println("Greeting");
        else -> println("Unknown");
    }
    //An expression returns a value that can be used later in your code.
    val result = when (obj) {
        "1" -> "One";
        "Hello" -> "Greeting";
        else -> "Unknown";
    }
    println(result);

    //This example uses a when expression without a subject to check a chain of Boolean expressions:
    val trafficLightState = "Red";
    val trafficAction = when {
        trafficLightState == "Green" -> "Go";
        trafficLightState == "Yellow" -> "Slow down";
        trafficLightState == "Red" -> "Stop";
        else -> "Malfunction";
    }
    println(trafficAction);
    //However, you can have the same code but with trafficLightState as the subjec
    val trafficAction2 = when (trafficLightState) {
        "Green" -> "Go"
        "Yellow" -> "Slow down"
        "Red" -> "Stop"
        else -> "Malfunction"
    }
    println(trafficAction2);
    //Using when with a subject makes your code easier to read and maintain. When you use a subject with a when expression, it also helps Kotlin check that all possible cases are covered. Otherwise, if you don't use a subject with a when expression, you need to provide an else branch.
}
fun conditionalExercises() {
    //Exercise 1
    //Create a simple game where you win if throwing two dice results in the same number.
    // Use if to print You win :) if the dice match or You lose :( otherwise.
    val firstResult = Random.nextInt(6);
    val secondResult = Random.nextInt(6);
    if (firstResult == secondResult) {
        println("You win :)");
    } else {
        println("You lose :(");
    }
    //Exercise 2
    //Using a when expression, update the following program so that
    // it prints the corresponding actions when you input the names
    // of game console buttons.
    val button = "A";
    println(
        when (button) {
            "A" -> "Yes";
            "B" -> "No";
            "X" -> "Menu";
            "Y" -> "Nothing";
            else -> "There is no such button";
        }
    );


}