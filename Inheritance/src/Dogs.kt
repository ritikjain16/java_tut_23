//                        CHILD CLASS
class Dogs(legs:Int,color:String,var eyes:Int):Animals(legs,color) {

//     fun bark(){
//         println("I bark with ${eyes} eyes")
//     }

//    Overriding a function
    override fun sounds() {
        println("I bark ")
    }
}