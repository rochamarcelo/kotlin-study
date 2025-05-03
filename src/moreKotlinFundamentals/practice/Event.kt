package moreKotlinFundamentals.practice

data class Event (
    val title: String,
    val description: String?,
    val daypart: DayPart,
    val duration: Int,
) {
}