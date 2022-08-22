package masala00

fun main() {
    when(readLine()!!.toInt()) {
        1 -> {
            println("Yanvarda 31 kun bor")
        }2 -> {
            println("Fevralda 28 kun bor")
        }3 -> {
            println("Martda 31 kun bor")
        }4 -> {
            println("Aprelda 30 kun bor")
        }5 -> {
            println("Mayda 31 kun bor")
        }6 -> {
            println("Iyunda 30 kun bor")
        }7 -> {
            println("Iyulda 31 kun bor")
        }8 -> {
            println("Avgustda 31 kun bor")
        }9 -> {
            println("Sentyabrda 30 kun bor")
        }10 -> {
            println("Oktyabrda 31 kun bor")
        }11 -> {
            println("Noyabrda 31 kun bor")
        }12 -> {
            println("Dekabrda 31 kun bor")
        }
        else -> {
            println("Topar oyi cheksiz kundan iborat...")
        }
    }
}