fun mainList() {
    //Read only list
    val readOnlyShapes = listOf("triangle", "square", "circle");
    println(readOnlyShapes)

    //Mutable list with explicit type declaraation
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)
    //To prevent unwanted modifications, you can create a read-only view of a mutable list by assigning it to a List:
    //This is also called casting.
    val shapesLocked: List<String> = shapes;
    //Lists are ordered so to access an item in a list, use the indexed access operator []:
    println("The first item in the list is ${readOnlyShapes[0]}");
    println("The second item in the list is ${readOnlyShapes[1]}");
    //To get the first or last item in a list, use .first() and .last() functions respectively:
    println("The first item in the list is ${readOnlyShapes.first()}");
    println("The last item in the list is ${readOnlyShapes.last()}");
    //.first() and .last() functions are examples of extension functions.
    //To get the number of items in a list, use the .count() function:
    println("This list has ${readOnlyShapes.count()} items")
    //To check that an item is in a list, use the in operator
    println("circle" in readOnlyShapes);//true
    println("rectangle" in readOnlyShapes);//false
    //To add or remove items from a mutable list, use .add() and .remove() functions respectively:
    shapes.add("pentagon");
    println(shapes);
    shapes.remove("pentagon");
    println(shapes)
}
fun mainSet() {
    //Whereas lists are ordered and allow duplicate items, sets are unordered and only store unique items.
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry");//only one cherry is included in the list
    println(readOnlyFruit);
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry");
    //You can see in the previous example that because sets only contain unique elements, the duplicate "cherry" item is dropped.
    println(fruit);

    //To prevent unwanted modifications, you can create a read-only view of a mutable set by assigning it to a Set:
    val fruitLocked: Set<String> = fruit;
    println(fruit);

    //As sets are unordered, you can't access an item at a particular index.
    println("This set has ${readOnlyFruit.count()} items.");

    //To check that an item is in a set, use the in operator:
    println("banana" in readOnlyFruit);
    //To add or remove items from a mutable set, use .add() and .remove() functions respectively:
    fruit.add("dragonfruit");
    println(fruit);

    fruit.remove("dragonfruit");
    println(fruit);
    fruit.remove("unknonw");//no error when used for item not in the set
    println(fruit);

}

fun mainMap() {
    //The easiest way to create maps is to use to between each key and its related value:
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100);
    println(readOnlyJuiceMenu);

    // Mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100);
    println(juiceMenu);
    //To prevent unwanted modifications, you can create a read-only view of a mutable map by assigning it to a Map:
    val juiceMenuLocked: Map<String, Int> = juiceMenu;
    println(juiceMenuLocked);
    println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}");
    println("The value of kiwi juice is: ${readOnlyJuiceMenu["kiwi"]}");
    println("The value of unknown juice is: ${readOnlyJuiceMenu["unknown"]}");//Null when key does not exists

    //You can also use the indexed access operator [] to add items to a mutable map:
    juiceMenu["coconut"] = 150;
    println(juiceMenu);
    println("The value of coconut juice is ${juiceMenu["coconut"]}");
    //To remove items from a mutable map, use the .remove() function:
    juiceMenu.remove("coconut");
    println(juiceMenu);
    println("The value of coconut juice is ${juiceMenu["coconut"]}");

    //To get the number of items in a map, use the .count() function:
    println("This map has ${juiceMenu.count()} key-value pairs");
    //To check if a specific key is already included in a map, use the .containsKey() function:
    println(readOnlyJuiceMenu.containsKey("kiwi"));//true
    println(readOnlyJuiceMenu.containsKey("coconut"));

    //To obtain a collection of the keys or values of a map, use the keys and values properties respectively:
    println(readOnlyJuiceMenu.keys);
    println(readOnlyJuiceMenu.values);
    //To check that a key or value is in a map, use the in operator:
    println("orange" in readOnlyJuiceMenu.keys);//true
    println("dragonfruit" in readOnlyJuiceMenu.keys);//false
    // Alternatively, you don't need to use the keys property
    println("orange" in readOnlyJuiceMenu);//true
    println("dragonfruit" in readOnlyJuiceMenu);//false

    println(100 in readOnlyJuiceMenu.values);//true
    println(200 in readOnlyJuiceMenu.values);//false
}
fun mainExercises() {
    //Exercise 1
    val greenNumbers = listOf(1, 4, 23);
    val redNumbers = listOf(17, 2);
    val totalNumbers = greenNumbers.count() + redNumbers.count();
    println("There are ${totalNumbers} numbers in total");

    //Exercise 2
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP");
    val requested = "smtp";
    val isSupported = requested.uppercase() in SUPPORTED;
    println("Support for $requested: $isSupported");
    //Exercise 3
    val number2word = mapOf(1 to "One", 2 to "Two", 3 to "Three");// Write your code here
    val n = 2
    println("$n is spelt as '${number2word[n]}'");
}