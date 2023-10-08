import java.util.*
class Robot(var name:String) {

    fun ringTheAlarm(day:Int) {
        var dayList =
            mutableListOf<String>("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
        println("Hi! I am ${name}. Good Morning Ritik.  ")
        print("Alarm Rings on  ")
        dayList.remove("Sunday")
        var r=day
        println("${dayList.get(r)}  at 6:00 am .")



    }


    fun coffee(typeOfCoffee:Int,tbspOfSugar:Int) {
        println("")
        println("Time for coffee.")
          println("How do you like your coffee? (Black/with milk)")


            var g=typeOfCoffee
        println("How much Sugar You'll take?")
        println("2 tbsp sugar or 3/more tbsp sugar.")
        var c=tbspOfSugar
        println("Yummy. Ok, I will prepare it for you.")
    }

    fun heatWater(typeOfWater:Int) {

        println("")
     println("Now. Time for bath.")
        println("In which water you would like to bath?")
        println("Enter 1 for cold , 2 for Hot , and 3 for Neutral in arguments.")

        var m=typeOfWater
        println("Ok. I'll ready it for you.")

    }

    fun bag(timeTable:Int) {
        println("")
        var timeTables=
            mutableListOf("Physics", "Chemistry", "Maths", "English", "Programming in kotlin", "Programming in C")
         println("What is the day today?" +
                 "Type 0 for Monday and so on...")
        var t=timeTable
        println("Today is your ${timeTables.get(t)} class. I'll put all the books related to ${timeTables.get(t)} in your bag.")


    }

    fun breakfastAndLunch() {
println(""+
    "Time for food.")
        var food= mutableListOf("Bread and Butter","Dosa","Chowmein","Momos","Samosa","Poha","Dal Chawal","Dal Roti")
        println("Delicious. Today you will get ${food.random()}")

    }

    fun ironClothes() {

     var cl= mutableListOf("Jeans and Shirt","Jeans and t-shirt","Shirt and Trousers")


println("")
        println("Now.I'll iron your ${cl.random()} for you as soon as you come out after bathing.")

    }

}


fun main(){
    val bot=Robot("Alexa")
    bot.ringTheAlarm(2)
    bot.coffee(1,2)
    bot.heatWater(2)
    bot.bag(4)
    bot.breakfastAndLunch()
    bot.ironClothes()
}