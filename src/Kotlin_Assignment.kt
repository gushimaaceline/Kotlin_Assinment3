fun main() {
    characters()
    println(details("Celine",22))
println(stringLength("Gushima"))
    comparision("Abella")

}
fun characters() {
    var word= "akirachix"
    print(word[0])
    print(word[2])
    println(word[3])
}
fun details(name:String,age:Int):String{
    return "Hi, my name is " +name+ " and I am " +age+ " years old"
}
fun stringLength(name: String):Int {
    return name.length
}
fun comparision(name: String) {
    var name= "Abella"
    if (name== "Abella") {
        println("That's me!")
    }
    else{
        println("I don't know who that is")
    }
}

