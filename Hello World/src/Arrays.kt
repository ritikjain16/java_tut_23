import java.util.*

fun main(){

    val c= arrayOf(2,544,45)

    val r=arrayOf("ritik", 89 ,'d' , true, 56.2)

    val stringArray=arrayOf("hello","kotlin")


    println(c[2])
    println(r[0])
    println(stringArray[1 ])


    r[2]=false
    println(r[2])
stringArray[1]="Ritik"
    println(Arrays.toString(stringArray))
//    for finding the size of an
    println(r.size)


    println(Arrays.toString(r))
}

