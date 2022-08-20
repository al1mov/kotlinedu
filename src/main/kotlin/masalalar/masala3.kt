import kotlin.math.hypot
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val katet_a = 5
    val katet_b = 8
    val hyp_c = sqrt(katet_a.toDouble().pow(2)+katet_b.toDouble().pow(2))
    val perP = katet_a + katet_b + hyp_c
    println("To'g'ri uchburchakning gipotenuzasi c ${hyp_c.toInt()}'ga, perimetri esa ${perP.toInt()}'ga teng")
}