package moreKotlinFundamentals.rewriteExtension

data class Question<T> (
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
) {
}