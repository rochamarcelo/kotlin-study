package moreKotlinFundamentals.practice

val Event.durationOfEvent: String
    get() {
        if (durationInMinutes < 60) {
            return "short";
        }
        return "long";
    }
fun main() {
    val events = mutableListOf(
        Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0),
        Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15),
        Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30),
        Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60),
        Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10),
        Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45),
    );

    println("Total events: ${events.size}");
    val shortEvents = events.filter { it.durationInMinutes < 60 }.size
    println("You have $shortEvents short events");
    val groupByDaypart = events.groupBy { it.daypart }
    println(groupByDaypart);
    println("Summary of all the events and their daypart.");
    groupByDaypart.forEach { (daypart, events) ->
        println("$daypart: ${events.size} events")
    }
    println("Last event of the day: ${events.last().title}")
    println("Duration of first event of the day: ${events[0].durationOfEvent}")
}