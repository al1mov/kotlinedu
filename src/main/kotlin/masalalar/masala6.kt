import kotlin.math.pow

fun main() {
    val x = 4.0
    val first = 3*x
    val second = 6*x
    val result = first.toDouble().pow(6)-second.toDouble().pow(2)-7
    println(result.toInt())
}