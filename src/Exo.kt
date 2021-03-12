fun main() {
    characters()
    println(identification("Celine",22))
    println(nameLength("Gushima"))
    compar("Sharon")
}
fun characeristcs() {
    var school= "AkiraChix"
    print(school[0])
    print(school[2])
    println(school[3])
}
fun identification(name:String,age:Int):String {
return "Hi, my name is $name  and I am $age  years old"
}
fun nameLength(name: String):Int {
   return name.length
}
fun compar(name: String){

    if (name=="Celia") {
        println("That's me!")
    }
    else {
      println("I don't know who that is")
    }
}

