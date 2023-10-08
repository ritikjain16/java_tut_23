// use data keyword before class to get the correct output
data class Restaurants constructor(var name:String,var rating:Double,var costForOne:Double) {

}
// we can also make a different file for main function
fun main(){
    val r1=Restaurants("Tasty Bites",4.0,50.0)
    val r2=Restaurants("China Town",4.2,30.0)
    val r3=Restaurants("Saxena",3.8,40.0)
    val r4=Restaurants("Saxena",3.8,40.0)

//    println(r1)
//    println(r2)
//    println(r3)

//    but if we have more no. of restaurants then first make list of objects and
//    use for loop

    var restaurantList= mutableListOf(r1,r2,r3)

    for (r in restaurantList){
        println(r)
    }

//    to check that 2 objects are same or not.

//    if we not use the data class then output will be different

    if (r3==r4){
        println("Same")

    }
    else{
        println("Different")
    }
}