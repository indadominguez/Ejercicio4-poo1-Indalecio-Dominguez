fun main() {
    try {
        val coche1 = Coche("Audi", "a3", 150, 5, "1234567")
        coche1.color = "Rojo"
        println(coche1)

        val coche2 = Coche("", "", 150, 5, "1234567")
    } catch (e: CocheException) {
        println("Error: ${e.message}")
    }

    try {
        val coche3 = Coche("BMW", "m3", 50, 5, "1234567")
    } catch (e: CocheException) {
        println("Error: ${e.message}")
    }

    try {
        val coche4 = Coche("Mercedes", "Clase C", 150, 2, "1234567")
    } catch (e: CocheException) {
        println("Error: ${e.message}")
    }

    try {
        val coche5 = Coche("Ford", "Fiesta", 120, 5, "12345")
    } catch (e: CocheException) {
        println("Error: ${e.message}")
    }

    try {
        val coche6 = Coche("Toyota", "Corolla", 120, 4, "1234567")
        coche6.color = ""
    } catch (e: CocheException) {
        println("Error: ${e.message}")
    }
}