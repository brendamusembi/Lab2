import java.util.*//required import
fun main(args: Array<String>) {
    println("Hello, ${args[0]}")
    println("*END OF TASK 1*")

    //Will assign kotlin.unit
    val isUnit = println("This is an expression")
    println(isUnit)
    println("*END OF TASK 2 STEP 1*")

    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)
    println("*END OF TASK 2 STEP 2*")

    val temperature_1 = 10
    val message = "The water temperature is ${ if(temperature_1 > 50) "too warm" else "OK"}."
    println(message)
    println("*END OF TASK 2 STEP 3*")

    fun randomDay() : String{
        val week= arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
            return week[Random().nextInt(week.size)]
    }

    fun feedTheFish(){
        val day = randomDay()
        val food = "pellets"
        println("Today is $day and the fish eat $food")
    }
    feedTheFish()
    println("*END OF TASK 3 STEP 1*")

    fun fishFood (day: String) :String{
        var food= ""
        when (day){
            "Monday"-> food = "flakes"
            "Tuesday"-> food = "pellets"
            "Wednesday"-> food = "redworms"
            "Thursday"-> food = "granules"
            "Friday"-> food = "mosquitoes"
            "Saturday"-> food = "lettuce"
            "Sunday"-> food = "plankton"
        }
        return food
    }
    fun feedTheFish_1 (){
    val day= randomDay()
    val food= fishFood(day)

    println("Today is $day and fish eat $food")

}
        fun fishFood_1 (day_1 : String) : String {
        return when (day_1) {
            "Monday" -> "flakes"
            "Wednesday" -> "redworms"
            "Thursday" -> "granules"
            "Friday" -> "mosquitoes"
            "Sunday" -> "plankton"
            else -> "nothing"
        }
    }
    fun feedTheFish_2() {
        val day_1 = randomDay()
        val food_1 = fishFood(day_1)
        println ("Today is $day_1 and the fish eat $food_1")
    }
    feedTheFish_2()
    println("*END OF TASK 3*")


    fun swim(speed: String = "fast"){
        println("swimming $speed")
    }
    swim() // uses the default speed
    swim("slow") // positional argument
    swim(speed = "turtle-like")


    fun isTooHot(temperature_4: Int) = temperature_4 > 30

    fun isDirty(dirty_1: Int) = dirty_1 > 30

    fun isSunday(day: String) = day == "Sunday"

    fun shouldChangeWater (day:String, temperature_2:Int = 22, dirty: Int = 20) : Boolean{
        return when {

            isTooHot(temperature_2) -> true
            isDirty(dirty) -> true
            isSunday(day) -> true
            else -> false
        }
    }

    fun feedTheFish_3(){
        val day_2 = randomDay()
        val food_2 = fishFood(day_2)
        println("Today is $day_2 and the fish eat $food_2")
        println("Change water: ${shouldChangeWater(day_2)}")
    }
    feedTheFish_3()
    println("*END OF TASK 4*")
}