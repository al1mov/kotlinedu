package masala00

fun main() {
    when(readLine()!!.toInt()) {
        1, 2, 12 -> {
            println("Qish")
        }
        3, 4, 5 -> {
            println("Bahor")
        }
        6, 7, 8 -> {
            println("Yoz")
        }
        9, 10, 11 -> {
            println("Kuz")
        }
    }
}