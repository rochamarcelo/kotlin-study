package kotlinFundamentals.practice.foldablePhones

open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
        println("Phone is on");
    }

    fun switchOff() {
        isScreenLightOn = false
        println("Phone is off");
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}