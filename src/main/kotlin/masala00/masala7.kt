package masala00

fun main() {
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    when(readLine()) {
        "+" -> {
          println("Natijasi ${num2 + num1}")
        }
        "-" -> {
            println("Natijasi ${num1 - num2}")
        }
        "*" -> {
            println("Natijasi ${num1 *  num2}")
        }
        "/" -> {
            println("Natijasi ${num1 / num2}")
        }
    }
}