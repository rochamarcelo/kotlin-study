package practice.foldablePhones

fun main() {
    val phone = Phone();
    phone.switchOn();
    phone.checkPhoneScreenLight();
    phone.switchOff();
    phone.checkPhoneScreenLight();

    val phone2 = FoldablePhone();
    phone2.checkPhoneScreenLight();
    phone2.unfold();
    phone2.switchOn();
    phone2.checkPhoneScreenLight();
    phone2.switchOff();
    phone2.fold();
    phone2.switchOn();
    phone2.checkPhoneScreenLight();
}