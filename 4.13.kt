fun main() {
    print("Введите код ошибки (100, 200, 300): ")
    val errorCode = readLine()!!.toInt()

    val errorMessage = when (errorCode) {
        100 -> "Ошибка природы."
        200 -> "Ошибка аборта."
        300 -> "Ошибка тракториста."
        else -> "Неизвестный код ошибки."
    }

    println(errorMessage)
}
