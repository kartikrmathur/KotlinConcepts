package DataStructures

fun main(args : Array<String>){

    // creating empty arraylist using constructor
    var ArrayList = ArrayList<String>()

    //adding String elements in the list
    ArrayList.add("Kartik")
    ArrayList.add("Mathur")

    // iterating the list
    for (i in ArrayList){
        println(i)
    }

    println("ArrayList after insertion -- >")

    ArrayList.add(1,"Chatur")
    for (i in ArrayList){
        println(i)
    }
    var ArrayList1 = ArrayList<String>()
    println("Elements in arraylist1 after adding all from Arraylist -->")
    ArrayList1.addAll(ArrayList)
    for(i in ArrayList1) {
        println(i)
    }
//    It is used to return the element at specified index in the list. It throws IndexOutOfBoundsException if the specified index is out of range.
    println("Accessing the index 2 of arraylist: "+ ArrayList1.get(2))
    // set the element at index 3 with new string

    ArrayList.set(2,"A computer Science portal for students")
    println("arrayList after set :- ")
    for(i in ArrayList)
        println("$i ")

    // indexOf method is used to get the index of the first occurrence of the specified element in the list.
    println("The index of the element is: "+ArrayList.indexOf("Geeks"))
    println("The index of the element is: "+ArrayList.indexOf("Mathur"))
    println("The index of the element is: "+ArrayList.indexOf("Chatur"))
    println("The index of the element is: "+ArrayList.indexOf("Kartik"))

//    remove method is used to remove the first occurrence of the specified element in the list. If the element is not present in the list, then it returns false.
    ArrayList.remove("A computer Science portal for students")
    for(i in ArrayList)
        println("$i ")

    println("size of Arraylist initially:- "+ArrayList1.size)
    ArrayList1.clear()
    println("size of Arraylist after clear:- "+ArrayList1.size)

//  To create an ArrayList in Kotlin, you can use the arrayListOf() function or the ArrayList constructor.
    val list = arrayListOf(1,2,3,4)
    println(list)
    // Add elements to the list
    list.add(1)
    println(list)
    // Add elements to the list at index
    list.add(1,0)
    println(list)

    list.remove(7)
    println(list)
    // Remove elements from the list
    list.remove(1)
    println(list)
    // Removes element at index 3
    list.removeAt(3)
    println(list)

    list[0] = 7
    println(list)


    println("After updating elements: $list")

    // Access elements in the list
    val first = list[0]
    val last = list.last()

    println("First element: $first")
    println("Last element: $last")

    // Iterate over the list
    for (element in list) {
        println(element)
    }
    
}