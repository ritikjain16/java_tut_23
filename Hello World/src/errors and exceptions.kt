fun main (){

    val a=arrayOf(1,2,3,4)

    try {
        a[4]=5
//        in try statement not run if above condition is false
        println("value changed")
    }
    catch (e:ArrayIndexOutOfBoundsException){
//        in catch statement runs
println("exception")
    }
//    finally keyword is optional
//    finally {
//        println(a[2])
//    }

    println(a[2])

}