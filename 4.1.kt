fun main() {
    print("Введите номер дня недели (1-7): ")
    val dayNumber = readLine()!!.toInt()

    val dayOfWeek = when (dayNumber) {
        1 -> "Понедельник"
        2 -> "Вторник"
        3 -> "Среда"
        4 -> "Четверг"
        5 -> "Пятница"
        6 -> "Суббота"
        7 -> "Воскресенье"
        else -> "Некорректный номер дня"
    }

    println("День недели: $dayOfWeek")
}
