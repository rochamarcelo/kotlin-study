package moreKotlinFundamentals.practice

fun main() {
    val event1 = Event(
        title = "Study Kotlin",
        description = "Commit to studying Kotlin at least 15 minutes per day.",
        daypart = DayPart.EVENING,
        duration = 15,
    );
    println(event1);
}