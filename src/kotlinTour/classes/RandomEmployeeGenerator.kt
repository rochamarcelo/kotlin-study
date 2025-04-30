package kotlinTour.classes

import kotlin.random.Random
class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {
    val names: List<String> = listOf("John Doe", "Mary Doe", "Marcelo", "Peter Park", "Clark Kent", "Bruce Wayne", "Oliver Queen", "Diana", "Selina", "Sarah");
    fun generateEmployee(): Employee {
        return Employee(names.random(), Random.nextInt(minSalary, maxSalary));
    }
}