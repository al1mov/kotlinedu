import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val x1 = 5.6
    val x2 = 3
    val y1 = 9.9
    val y2 = 8
    val sqrX =  (x1-x2)
    val sqrY = (y1-y2)
    val result = sqrt(sqrX.pow(2)+sqrY.pow(2)) // .toInt()
    println(result)
}