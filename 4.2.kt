fun main() {
    print("Введите длину стороны a: ")
    val a = readLine()!!.toDouble()
    print("Введите длину стороны b: ")
    val b = readLine()!!.toDouble()
    print("Введите длину стороны c: ")
    val c = readLine()!!.toDouble()

    val triangleType = when {
        a + b <= c || a + c <= b || b + c <= a -> "Треугольник невозможен"
        a == b && a == c -> "Равносторонний треугольник"
        a == b || a == c || b == c -> "Равнобедренный треугольник"
        else -> "Разносторонний треугольник"
    }

    println("Тип треугольника: $triangleType")
}
