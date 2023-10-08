//                PARENT CLASS
// open is used to inherit this class
open class Animals(var legs:Int,var color:String) {
    fun eat(){
    println("I eat food")
    }
    fun sleep(){
        println("I sleep")
    }
    open fun sounds(){
        println("I make a sound")
    }

}