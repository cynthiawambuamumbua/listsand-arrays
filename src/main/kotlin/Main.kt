fun main() {
    arrayNumber()
    println(names("kijana", "kasichana", "jeff"))
    var carObjects = listOf(
        averageMileage("KMLOP342", 390.0),
        averageMileage("KPLWOP67", 190.0),
        averageMileage("KYIPK90", 120.2),
        averageMileage("WYI892G ", 239.0)
    )
            println(carObjects)
}


    //Lists assignment1. Create one function that given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order. (1 point)
    fun arrayNumber(){
        var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
        println(numbers[2].plus(numbers[5]))
        println(numbers.indexOf(158))
        numbers.sort()
        println(numbers.contentToString())
    }



//2. Given a list of Person objects, each with the attributes,
// name, age, height, and weight. Sort the list in order of descending age (2 points)
//
data class personObjects(var name:String, var age:Int,var height:Double, var weight:Int)
fun person(){
    var person1 =personObjects("cynthia", 19, 19.8,56 )
    var person2 =personObjects("kelitu", 94, 3.9,30 )
    var person3 =personObjects("Mumbua", 9, 1.1,14 )
    var Person = listOf(person1, person2, person3)
    var person = Person.sortedByDescending { person -> person.age }
    println(person)
}
//3. Create a function that takes in 3 names and returns
// a string array containing all 3 names. (2 points)
//
fun names(name1:String, name2:String, name3: String):String{
    var name= (arrayOf(name1,name2, name3))
    return name.contentToString()
}
//4. Write a function that takes in a list of Car objects
// each with a registration and mileage attribute and returns the average mileage of all the vehicles in the list. (3 points)}
data class CarObjects(var registration:String,var mileage:Double)
fun averageMileage(cars: String, d: Double):Double{
    var carMileage = 0.0
    for(car in cars){
        carMileage+=car.mileage
    }
    return carMileage/cars.size
}
