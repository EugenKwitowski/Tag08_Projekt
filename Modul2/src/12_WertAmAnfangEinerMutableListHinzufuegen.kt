fun main () {
    // Lösche das erste Element der MutableList mit einer Funktion, die du aus der Vorlesung kennst.
    var ingredients: MutableList<String> = mutableListOf("Kirschen", "Bananen", "Orangen", "Kirschen")
    // Dein Code hier:

    ingredients.add(0, "Kirschen")
    println(ingredients)

}