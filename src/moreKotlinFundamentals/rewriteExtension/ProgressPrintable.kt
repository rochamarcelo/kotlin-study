package moreKotlinFundamentals.rewriteExtension

interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}