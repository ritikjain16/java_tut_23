fun main(){
    var w=2


//    when(w){
//    1 -> println("sunday")
//        2 -> println("monday")
//        3 -> println("tuesday")
//        4 -> println("wednesday")
//        5 -> println("thursday")
//        6 -> println("friday")
//        7 -> println("saturday")
//
//        else-> println("wrong day")
//
//    }


//    when {
//       w>0-> println("positive")
//        w<0->println("negative")
//        else->println("zero")
//    }

    when(w){
//        in operator is use for a range
        in 1..10->println("between 1 to 10")
        in 11..20->println("between 11 to 20")
        in 21..30->println("between 21 to 30")
        else->println("out of range")
    }

}

