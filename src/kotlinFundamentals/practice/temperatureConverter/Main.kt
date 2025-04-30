package kotlinFundamentals.practice.temperatureConverter

fun main() {
    printFinalTemperature(
        27.0,
        "Celsius",
        "Fahrenheit"
    ) {value -> 9.0/5 * value + 32}
    printFinalTemperature(
        350.0,
        "Kelvin",
        "Celsius"
    ) {value -> value - 273.15}
    printFinalTemperature(
        10.0,
        "Fahrenheit",
        "Kelvin"
    ) {value -> 5.0/9  * (value - 32) + 273.15}
}


fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}