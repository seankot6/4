fun main() {
    print("Введите тип пищи (творог, китайская кухня, кокакола,  плоу): ")
    val foodType = readLine()!!.toString()

    val cookingTime = when (foodType.lowercase()) {
        "творог" -> "5 минут"
        "китайская кухня" -> "надо заказать"
        "кокакола" -> "надо купить"
        "плоу" -> "попросить маму"
        else -> "Неизвестный тип пищи"
    }

    println("Время приготовления: $cookingTime")
}
