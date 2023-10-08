class Dog {

//    State and Properties are define as:
    var breed:String ="Labrador"
    var color:String="brown"
    var age:Int=5
//    Behaviour is define as:
    fun eat(){
    println(" ${breed} is eating")
}
    fun bark(){
        println(" ${breed} is barking whose color is ${color}")

    }
}

fun main(){
    val dog1= Dog()

//    we can change the state and properties
    dog1.age=4
    dog1.breed="German Shepherd"
    dog1.color="black"

//  behaviours:
    dog1.eat()
    dog1.bark()

    println("age of dog is ${dog1.age}")
}