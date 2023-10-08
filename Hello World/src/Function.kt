fun main(){

r()
    i()
    println(t(6))
    println(j(8))
   println( h("jhgfdssdfghji76fv"))
    m("hello")
    z(12.3,56.238)
}

//BLOCK BODY
fun r() {
    println("hey!")
}

// also we can do by
//EXPRESSION BODY

fun i() = println("Hi Alexa")

//----------------------
//block body
fun t(x:Int):Int{
//    val k= x*2
//    println(k)
//    return k
    return x*2
}
// expression body
fun j(y:Int)=y*4


fun h(s:String):String{
    return s
}
fun m(d:String)= println(d)




fun z(a:Double,b:Double):Double {
    val c: Double = a + b
    println(c)
    return c
}