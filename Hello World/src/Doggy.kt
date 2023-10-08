//                    BOTH PRIMARY AND SECONDARY CONSTRUCTOR

// PRIMARY CONSTRUCTOR
class Doggy constructor(var breed:String,var color:String,var age:Int) {

    var name:String?=null

    //SECONDARY CONSTRUCTOR
    constructor(breed: String,color: String,age: Int,name:String):this(breed, color, age){
        this.name=name
    }
}
fun main(){

//    object which use only primary constructor
    val dog1=Doggy("Labrador","Brown",4)

    //    object which use both primary and secondary constructor
    val dog2=Doggy("German shepherd","Black",5,"Jerry")

}