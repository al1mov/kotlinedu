fun main() {
    val age = readLine(/*"Yoshingizni kiriting..."*/)!!.toInt()
    if (age >= 18) {
        println("Siz voyaga yetgansiz")
    }
    else {
        println("Siz voyaga yetmagansiz...")
    }
}