fun main(){
    name()
    var word = sentence("Wanji", "19")
    println(word)
    length()
    statement()
}

fun name (){
    var a = "Akirachix"
    var b = (a[0].toString()+a[2]+a[3])
    println(b)
}

fun sentence (name: String, age:String): String{
     var y = "Hi my name is $name I am $age years old"
    return y
}

fun length(){
    var c = "Stunning"
    println(c.length)
}

fun statement(){
    var name = "kimmyworld"
    if(name=="kimmyworld"){
        println("That's me!")
    }
    else println("I don't know who that is!")
}
