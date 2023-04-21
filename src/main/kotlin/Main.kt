import javax.print.attribute.standard.PrinterInfo

fun main() {
    var cars = Cars("subaru","forester","kcw23",20)
    cars.hoot()

    var total= Human("Janet",20,30)
    total.eat(2)
    total.speak("Annet is sleeping")
    total.birthday()


}
class Cars( var make:String, var model:String, var registration:String,var speed:Int){
    fun hoot (){
        println("pip pip")
    }

}
class Human(var name:String, var age:Int,var weight:Int ){
    fun eat(foodWeight:Int){
        var newWeight= weight +foodWeight
        println("I am eating $newWeight kgs of food")

    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        println(++age)
    }

    }



