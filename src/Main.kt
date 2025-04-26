

fun main() {
    val contact = Contact(1, "mary@example.com");
    println(contact.email);
    println(contact.category);
    contact.email = "johndoe@example.com";
    println(contact.email);
    println("Their email address is: ${contact.email}");
    contact.printId();

    val user1 = User("John Doe", 1000);
    val user2 = User("Mary Jane", 1500);
    val user3 = User("John Doe", 1000);
    println(user1.toString());
    println(user1);
    // == or .equals have the same result
    println("user1 equals user2: ${user1.equals(user2)}");
    println("user1 == user2: ${user1 == user2}");
    println("user1 equals user3: ${user1.equals(user3)}");
    println("user1 == user3: ${user1 == user3}");

    println(user1.copy());
    println(user1.copy("Max"));
    println(user1.copy(id=3));

    //Exercise 1
    val employee = Employee("Mary", 20);
    println(employee);
    employee.salary += 10;
    println(employee);

    //Exercise 2
    val person = Person(
        Name("John", "Smith"),
        Address("123 Fake Street", City("Springfield", "US")),
        ownsAPet = false
    )
    println(person);
    //Exercise 3
    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee());

}