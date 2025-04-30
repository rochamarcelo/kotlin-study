package kotlinFundamentals.practice.songCatalog

fun main() {
    val song1 = Song("Gothan kotlinTour.classes.City", "Camisa de Venus", 1985, 1000000);
    song1.printDescription();
    println("Song played ${song1.playCount} times. Is song popular? ${song1.isPopular}");

    val song2 = Song("Hoje", "Camisa de Venus", 1985, 555555555);
    song2.printDescription();
    println("Song played ${song2.playCount} times. Is song popular? ${song2.isPopular}");

    val song3 = Song("New Song", "New Band", 2025, 900);
    song3.printDescription();
    println("Song played ${song3.playCount} times. Is song popular? ${song3.isPopular}")

}