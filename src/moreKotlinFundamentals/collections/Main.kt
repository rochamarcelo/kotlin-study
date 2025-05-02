package moreKotlinFundamentals.collections

fun main() {
    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars");
    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune");
    val solarSystem = rockPlanets + gasPlanets;
    solarSystem[3] = "Little Earth"
    println(solarSystem[0])
    println(solarSystem[1])
    println(solarSystem[2])
    println(solarSystem[3])
    println(solarSystem[4])
    println(solarSystem[5])
    println(solarSystem[6])
    println(solarSystem[7])
//    solarSystem[8] = "Pluto"//this results in error, can't resize an array.

    val solarSystemList = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystemList);
    println(solarSystem[2]);
    println(solarSystem.get(3))
    println(solarSystem.indexOf("Earth"))
    for (planet in solarSystem) {
        println(planet)
    }

    val solarSystemMutableList = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    solarSystemMutableList.add("Pluto");
    println(solarSystemMutableList);
    solarSystemMutableList.add(3, "Theia")
    println(solarSystemMutableList);
    solarSystemMutableList.removeAt(9)
    println(solarSystemMutableList);
    solarSystemMutableList.remove("Mars")
    println(solarSystemMutableList);
    println("Mars" in solarSystemMutableList)
    println("Venus" in solarSystemMutableList)

    val solarSystemSet = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystemSet);
    println(solarSystemSet.size)
    solarSystemSet.add("Pluto")
    println(solarSystemSet.size)
    solarSystemSet.add("Pluto")
    println(solarSystemSet.size)
    println(solarSystemSet.contains("Pluto"))
    println(solarSystemSet.remove("Pluto"))
    println(solarSystemSet.size)
    println(solarSystemSet.contains("Pluto"))

    val solarSystemMap = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )
    println(solarSystemMap)
    println(solarSystemMap.size)
    println(solarSystemMap["Pluto"])
    solarSystemMap["Pluto"] = 5
    println(solarSystemMap["Pluto"])
    println(solarSystemMap.get("Theia"))
    solarSystemMap.remove("Pluto")
    println(solarSystemMap.size)
    solarSystemMap["Jupiter"] = 78
    println(solarSystemMap["Jupiter"])
    solarSystemMap.put("Unknown", 30);
    println(solarSystemMap["Unknown"])
}