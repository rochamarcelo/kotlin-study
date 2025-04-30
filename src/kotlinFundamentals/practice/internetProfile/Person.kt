package kotlinFundamentals.practice.internetProfile

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun getReferrerText(): String {
        if (referrer !== null) {
            return "Has a referrer named ${referrer.name}, who ${referrer.getHobbyText().lowercase()}";
        }
        return "Doesn't have a referrer."
    }
    fun getHobbyText(): String {
        if (hobby !== null) {
            return "Likes to $hobby."
        }
        return "Doesn't have a hobby."
    }
    fun showProfile() {
        println("kotlinTour.classes.Name: $name");
        println("Age: $age");
        println("${getHobbyText()} ${getReferrerText()}")
        println("")
    }
}