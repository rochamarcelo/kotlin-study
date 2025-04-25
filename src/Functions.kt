import kotlin.math.PI

//You can declare your own functions in Kotlin using the fun keyword.
fun hello() {
    return println("Hello, world!");
}
fun sum(x: Int, y: Int): Int {
    return x + y;
}
//Single-expression functions, You can remove the curly braces {}
// and declare the function body using the assignment operator =
fun shortSum(x: Int, y: Int) = x + y
fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix]: $message");
}
fun printMessage(message: String) {
    println(message)
    // `return Unit` or `return` is optional
}
val registeredUsernames = mutableListOf("john_doe", "jane_smith")

// A list of registered emails
val registeredEmails = mutableListOf("john@example.com", "jane@example.com")

fun registerUser(username: String, email: String): String {
    // Early return if the username is already taken
    if (username in registeredUsernames) {
        return "Username already taken. Please choose a different username."
    }

    // Early return if the email is already registered
    if (email in registeredEmails) {
        return "Email already registered. Please use a different email."
    }

    // Proceed with the registration if the username and email are not taken
    registeredUsernames.add(username)
    registeredEmails.add(email)

    return "User registered successfully: $username"
}

fun circleArea(radius: Int): Double {
    return PI * radius * radius
}
fun cirAreaSimple(radius: Int): Double = PI * radius * radius;
fun mainFunctions() {
    hello();
    println(sum(1, 2));
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix(prefix = "Log", message = "Hello");
    printMessageWithPrefix("Hello");

//    If your function doesn't return a useful value then
//    its return type is Unit. Unit is a type with only one value – Unit.
//    You don't have to declare that Unit is returned explicitly in
//    your function body. This means that you don't have to use
//    the return keyword or declare a return type:
    printMessage("Hello")
    //Using single-expression functions
    println(shortSum(2, 3));
    println(registerUser("john_doe", "newjohn@example.com"))
    // Username already taken. Please choose a different username.
    println(registerUser("new_user", "newuser@example.com"))
    println(registerUser("new_user", "newuser@example.com"));

    println(circleArea(2));
    println(cirAreaSimple(2));
}