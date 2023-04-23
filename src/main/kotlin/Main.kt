



class Cars( var make:String, var model:String, var registration:String,var speed:Int){
    fun hoot (){
        println("pip pip")
    }

}
class Doctor(name: String, age: Int): Person(name, age){
    fun treatPatient(patient: String, disease: String){
        println("Treat $patient for $disease")
    }
}
class Farmer(name: String, age: Int): Person(name, age){
    fun cultivateLand(){
        println("dig dig dig")
    }
}
open class Person(var name: String, var age: Int){
    fun talk(words: String){
        println(words)
    }
    fun eat(){
        println("yum")
    }
    fun sleep(){
        println("zzzzz")
    }
}


