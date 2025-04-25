var debug = true;//this is a top-level. Variables can be declared outside the main() function at the beginning of your program. Variables declared in this way are said to be declared at top level.


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

fun main() {


}