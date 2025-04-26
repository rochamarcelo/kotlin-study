

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

}