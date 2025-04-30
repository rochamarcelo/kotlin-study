package kotlinFundamentals

class SmartHome (val smartTvDevice: SmartTvDevice, val smartLightDevice: SmartLightDevice) {
    var deviceTurnOnCount = 0
    fun turnOnTv() {
        if (!smartTvDevice.isOn()) {
            deviceTurnOnCount++
            smartTvDevice.turnOn();
            smartTvDevice.increaseSpeakerVolume()
        }
    }
    fun turnOffTv() {
        if (smartTvDevice.isOn()) {
            deviceTurnOnCount--
            smartTvDevice.turnOff()
        }
    }
    fun increaseTvVolume() {
        if (smartTvDevice.isOn()) {
            smartTvDevice.increaseSpeakerVolume()
        }
    }

    fun changeTvChannelToNext() {
        if (smartTvDevice.isOn()) {
            smartTvDevice.nextChannel();
        }
    }

    fun turnOnLight() {
        if (!smartLightDevice.isOn()) {
            deviceTurnOnCount++
            smartLightDevice.turnOn()
        }
    }

    fun turnOffLight() {
        if (smartLightDevice.isOn()) {
            deviceTurnOnCount--
            smartLightDevice.turnOff()
        }
    }

    fun increaseLightBrightness() {
        if (smartLightDevice.isOn()) {
            smartLightDevice.increaseBrightness();
        }
    }

    fun turnOffAllDevices() {
        turnOffTv()
        turnOffLight()
    }
    fun turnOnAllDevices() {
        turnOnTv()
        turnOnLight()
    }
    fun decreaseTvVolume() {
        if (smartTvDevice.isOn()) {
            smartTvDevice.decreaseSpeakerVolume();
        }
    }
    fun changeTvChannelToPrevious() {
        if (smartTvDevice.isOn()) {
            smartTvDevice.previousChannel();
        }
    }
    fun printSmartTvInfo() {
        if (smartTvDevice.isOn()) {
            smartTvDevice.printDeviceInfo();
        } else {
            println("Smart tv devise is offline");
        }
    }
    fun printSmartLightInfo() {
        if (smartLightDevice.isOn()) {
            smartLightDevice.printDeviceInfo();
        } else {
            println("Smart light devise is offline");
        }
    }
    fun decreaseLightBrightness() {
        if (smartLightDevice.isOn()) {
            smartLightDevice.decreaseBrightness();
        }
    }
    fun printAllDevicesInfo() {
        printSmartLightInfo();
        printSmartTvInfo();
    }
}