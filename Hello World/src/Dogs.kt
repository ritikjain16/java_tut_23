
//                  ONLY PRIMARY CONSTRUCTORS
// Constructor -> are used to REMOVE the initialisation of state and properties
//we can also remove constructor keyword
class Dogs constructor(var breed: String, var color: String, var age: Int) {
//                            Constructor variables

//    NAME OF CONSTRUCTOR VARIABLES AND MEMBER VARIABLES MUST BE SAME.

    //    State and Properties are define as:
//   Member or local variables

    //    declare var in constructor variable ,so below code will remove
//    var breed:String = breed
//    var color:String = color
//    var age:Int = age

//    this keyword
//    syntax ->  this.memberVariable=constructorVariable


//    "this" got remove when we  write -> var breed:String=breed
//    init {
//        this.breed=breed
//        this.color=color
//        this.age=age
//    }









    //    Behaviour is define as:
    fun eat(){
        println(" ${breed} is eating")
    }
    fun bark(){
        println(" ${breed} is barking whose color is ${color} and is ${age} years old.")

    }
}

fun main(){
    val dog1= Dogs("German shepherd" ,"Black",4)
    dog1.eat()
    dog1.bark()

    val dog2=Dogs("Labordar","Brown",5)
      dog2.eat()
    dog2.bark()
}