package masalalar

fun main() {
    val birinchi = readLine()!!.toInt()
    val ikkinchi = readLine()!!.toInt()
    val uchinchi = readLine()!!.toInt()

    val natija = birinchi == ikkinchi || birinchi == uchinchi || ikkinchi == 3
    println(natija)


}