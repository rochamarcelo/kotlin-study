package moreKotlinFundamentals.rewriteExtension

class Quiz : ProgressPrintable {
    override val progressText: String
        get() = "${answered} of ${total} answered"
    override fun printProgressBar() {
        repeat(Quiz.answered) { print("▓") }
        repeat(Quiz.total - Quiz.answered) { print("▒") }
        println()
        println(progressText)
    }
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
    val question4 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)

    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }
}