fun main() {
    val secretNumber = (1..100).random()
    var attempts = 0

    println("Угадайте число от 1 до 100")

    while (true) {
        print("Введите число: ")
        val guess = readLine()!!.toInt()
        attempts++

        when {
            guess > secretNumber -> println("Загаданное число меньше.")
            guess < secretNumber -> println("Загаданное число больше.")
            else -> {
                println("Поздравляю! Вы угадали за $attempts попыток.")
                break
            }
        }
    }
}
