fun mainLoops() {
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
fun loopExercises() {
    //Exercise 1
    var pizzaSlices = 0;
    while(pizzaSlices < 8) {
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++;
    }
    println("There are $pizzaSlices slices of pizza. Hooray! We have a pizza! :D");

    pizzaSlices = 0;
    do {
        println("There's only $pizzaSlices slice/s of pizza :(");
        pizzaSlices++;
    } while (pizzaSlices < 8);
    println("There are $pizzaSlices slices of pizza. Hooray! We have a pizza! :D");

    //Exercise 2
    for (number in 1..100) {
        println(when {
            number % 3 == 0 && number % 5 == 0 -> "fizzbuzz";
            number % 3 == 0 -> "fizz";
            number % 5 == 0 -> "buzz";
            else -> number;
        });
    }
    //Exercise 3
    //You have a list of words. Use for and if to print only the words that start with the letter l.
    val words = listOf("dinosaur", "limousine", "magazine", "language");
    for (word in words) {
        if (word.startsWith("l")) {
            println(word);
        }
    }

}