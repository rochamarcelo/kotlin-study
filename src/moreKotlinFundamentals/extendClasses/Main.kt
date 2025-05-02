package moreKotlinFundamentals.extendClasses

//Note: Extension properties can't store data, so they must be get-only.
val Quiz.StudentProgress.progressText: String
    get() = "${answered} of ${total} answered";

fun Quiz.StudentProgress.printProgressBar() {
    repeat(Quiz.answered) { print("▓") }
    repeat(Quiz.total - Quiz.answered) { print("▒") }
    println()
    println(Quiz.progressText)
}
fun main() {
//    println("${Quiz.answered} of ${Quiz.total} answered.")
//    println(Quiz.progressText)
    Quiz.printProgressBar();
}