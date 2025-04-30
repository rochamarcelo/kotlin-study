package kotlinFundamentals.practice.songCatalog

class Song(val title: String, val artist: String, val yearPublished: Int, var playCount: Int) {
    val isPopular : Boolean
        get() {
            return playCount >= 100;
        }

    fun printDescription() {
        println("$title, performed by $artist, was released in $yearPublished.")
    }
}