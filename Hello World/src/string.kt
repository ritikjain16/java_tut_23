fun main(){

//    STRING
    val a = " Hello Ritik!"

    val b = a.length
    println(b)

    val c= a.get(7)
    println(c)


//    STRING TEMPLATES BY   '$'

    println("the character at index 7 is ${a.get(7)} ")

    println("now string is ${a.subSequence(7,13)}")
    println("length is ${a.length}")
    println(a.indexOf('o'))

}