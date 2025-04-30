package kotlinFundamentals

fun main() {
    val tv = SmartTvDevice(deviceName = "Android TV", deviceCategory = "Entertainment");
//    println("Status ${tv.deviceStatus}");
//    tv.turnOn();
//    println("Status ${tv.deviceStatus}");
//    println("Current speaker volume ${tv.speakerVolume}");
//    tv.speakerVolume = 70;
//    println("Current speaker volume ${tv.speakerVolume}");
//    tv.speakerVolume = 99;
//    println("Current speaker volume ${tv.speakerVolume}");
//    tv.increaseSpeakerVolume();
//    println("Current speaker volume ${tv.speakerVolume}");
//    tv.increaseSpeakerVolume();
//    println("Current speaker volume ${tv.speakerVolume}");
//    tv.speakerVolume = 0;
//    println("Current speaker volume ${tv.speakerVolume}");
//    tv.speakerVolume = -10;
//    println("Current speaker volume ${tv.speakerVolume}");
    val tv2 = SmartDevice(name = "Android TV", category = "Entertainment", statusCode = 2);
    println("Status ${tv2.deviceStatus}");
    println(tv2);
    val tv3 = SmartTvDevice(deviceName = "LG TV", deviceCategory = "Entertainment");
    println("Status ${tv3.deviceStatus}");
    val smartLightDevice = SmartLightDevice("Google Light", "Utility");
    val smartHome = SmartHome(tv3, smartLightDevice);
    smartHome.turnOnTv();
    smartHome.changeTvChannelToNext();
    smartHome.increaseTvVolume();
    smartHome.turnOnLight()
    smartHome.increaseLightBrightness();
    smartHome.turnOffAllDevices();
    smartHome.printAllDevicesInfo();
    smartHome.turnOnAllDevices()
    smartHome.printAllDevicesInfo();
    smartHome.decreaseTvVolume();
    smartHome.changeTvChannelToPrevious();
    smartHome.printSmartTvInfo();
    smartHome.printSmartLightInfo();
    smartHome.decreaseLightBrightness();

}