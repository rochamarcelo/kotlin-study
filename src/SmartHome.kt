class SmartHome (val smartTvDevice: SmartTvDevice, val smartLightDevice: SmartLightDevice) {
    var deviceTurnOnCount = 0
        private set
    private var myCount = 0;
    fun turnOnTv() {
        deviceTurnOnCount++
        smartTvDevice.turnOn();
        smartTvDevice.increaseSpeakerVolume()
    }
    fun turnOffTv() {
        deviceTurnOnCount--
        smartTvDevice.turnOff()
    }
    fun increaseTvVolume() {
        smartTvDevice.increaseSpeakerVolume()
    }

    fun changeTvChannelToNext() {
        smartTvDevice.nextChannel()
    }

    fun turnOnLight() {
        deviceTurnOnCount++
        smartLightDevice.turnOn()
    }

    fun turnOffLight() {
        deviceTurnOnCount--
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness() {
        smartLightDevice.increaseBrightness()
    }

    fun turnOffAllDevices() {
        turnOffTv()
        turnOffLight()
    }
}