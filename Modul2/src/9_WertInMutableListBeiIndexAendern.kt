fun main () {
    // Ändere den Wert "Bananen" in der MutableList zu "Äpfel"
    var fruits: MutableList<String> = mutableListOf("Birnen", "Bananen", "Orangen")
    // Dein Code hier:

    // fruits.remove("Birnen")
    // fruits.removeAt(0)
    // fruits.add(0, "Äpfel")

    // println(fruits)

    fruits[0] = "Äpfel"
    println(fruits)
}