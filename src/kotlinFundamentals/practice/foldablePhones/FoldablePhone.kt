package kotlinFundamentals.practice.foldablePhones

class FoldablePhone constructor(isOn: Boolean = false, private var isFolded: Boolean = false): Phone(isScreenLightOn = isOn) {
    override fun switchOn() {
        if (!isFolded) {
            super.switchOn()
        } else {
            println("Can't switch on, the phone is folded");
        }
    }
    fun fold() {
        if (!isFolded) {
            isFolded = true;
            println("Folded the phone")
        }
    }
    fun unfold() {
        if (isFolded) {
            isFolded = false
            println("Unfolded the phone")
        }
    }
}