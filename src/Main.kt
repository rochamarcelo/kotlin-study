fun toSeconds(time: String): (Int) -> Int = when (time) {
    "hour" -> { value -> value * 60 * 60 }
    "minute" -> { value -> value * 60 }
    "second" -> { value -> value }
    else -> { value -> value }
}

fun repeatN(n: Int, action: () -> Unit) {
    var index = 0;
    while(index < n) {
        action();
        index++;
    }
}

fun main() {
 val upperCaseString = {text: String -> text.uppercase()};
    println(upperCaseString("hello"));
    println("hello");
    val numbers = listOf(1, -2, 3, -4, 5, -6);
    val positives = numbers.filter{ x -> x > 0 };
    println(positives);
    val isNegatives: (Int) -> Boolean = {x: Int -> x < 0};
    val negatives = numbers.filter(isNegatives)
    println(negatives);

    val doubled = numbers.map { x: Int -> x * 2 }
    println(doubled);
    val isTripled = {x: Int -> x * 3};
    val tripled = numbers.map(isTripled);
    println(tripled)
    val timesInMinutes = listOf(2, 10, 15, 1)
    val min2sec = toSeconds("minute")
    val totalTimeInSeconds = timesInMinutes.map(min2sec).sum()
    println("Total time is $totalTimeInSeconds secs")
    // Total time is 1680 secs

    //Invoke separately﻿
    //Lambda expressions can be invoked on their own by adding parentheses ()
    // after the curly braces {} and including any parameters within the
    // parentheses:
    println({ text: String -> text.uppercase() }("hello"));

    //Exercise 1
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map{action -> "$prefix/$id/$action"};
    println(urls);
    //Exercise 2
    repeatN(5, {println("Hello")});
}