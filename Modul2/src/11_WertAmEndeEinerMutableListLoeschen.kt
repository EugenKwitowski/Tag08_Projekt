fun main () {
    // Lösche das letzte Element der MutableList mit einer Funktion, die du aus der Vorlesung kennst.
    var fruits: MutableList<String> = mutableListOf("Birnen", "Bananen", "Orangen", "Kirschen")
    // Dein Code hier:

    //println(fruits.size)
    //println(fruits[3])
    // fruits.remove("Kirschen")
    // fruits.removeAt(3)
    // println(fruits)

    fruits.removeLast()
    println(fruits)
}