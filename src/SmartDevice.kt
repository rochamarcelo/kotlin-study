open class SmartDevice (val name: String, val category: String) {
    var deviceStatus = "online"
        protected set(value) {
            field = value
        }
    open val deviceType = "unknown";

    constructor(name: String, category: String, statusCode: Int): this(name, category) {
        deviceStatus = when(statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }

    open fun turnOn() {
        println("Smart device is turned on.");
        deviceStatus = "online";
    }

    open fun turnOff() {
        println("Smart device is turned off.")
        deviceStatus = "offline";
    }
}