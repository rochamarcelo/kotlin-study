package kotlinTour.nullable

import Employee

fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}
fun lengthString(maybeString: String?): Int? = maybeString?.length
fun employeeById(id: Int) = when(id) {
    1 -> Employee("Mary", 20)
    2 -> null
    3 -> Employee("John", 21)
    4 -> Employee("Ann", 23)
    else -> null
}

fun salaryById(id: Int) = employeeById(id)?.salary ?: 0;

fun main() {
// neverNull has String type
    var neverNull: String = "This can't be null"

    // Throws a compiler error
//    neverNull = null; uncomment this to see the error

    // nullable has nullable String type
    var nullable: String? = "You can keep a null here"

    // This is OK
    nullable = null

    // By default, null values aren't accepted
    var inferredNonNull = "The compiler assumes non-nullable"

    // Throws a compiler error
//    inferredNonNull = null; uncomment this to see the error

    // notNull doesn't accept null values
    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(neverNull)) // 18
    // Throws a compiler error
//    println(strLength(nullable)); uncomment this to see the error

    val nullString: String? = null;
    println(describeString(nullString));
    println(lengthString(nullString));
    println(lengthString("Hello World!"));
    //Safe calls can be chained so that if any property of an object contains a null value, then null is returned without an error being thrown. For example:
    println(nullString?.uppercase());

    //Use Elvis operator
    //You can provide a default value to return if a null value is detected by using the Elvis operator ?:.
    println(nullString?.length ?: 0);
    //Exercise
    println((1..5).sumOf { id -> salaryById(id) })
}