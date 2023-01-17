fun main() {
    /*
        Wir haben eine Liste mit Namen und wollen wissen, ob sich die Namen "Jimmy" und "Chuck" in der Liste befinden.
        Erstelle eine neue Boolean-Variable, die uns zeigt, ob sich diese Namen in der Liste befinden.
        Benutze dafür die in der Vorlesung vorgestelle Methode.
     */
    var names: MutableList<String> = mutableListOf("Jimmy", "Hank", "Jesse", "Walter", "Marie", "Skyler", "Chuck")
    val namesAreInList: List<String> = listOf("Jimmy", "Chuck") // Ihr könnt diese Liste als Hilfsmittel verwenden
    //TODO füge hier deinen Code ein

    /*var contains = names.contains("Jimmy")
    var contains2 = names.contains("Chuck")
    println(contains)
    println(contains2)*/

    println(names.containsAll(namesAreInList))
}