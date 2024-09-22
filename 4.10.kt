fun main() {
    print("Введите способ оплаты (Нал, Кредитка, PayPal): ")
    val paymentMethod = readLine()!!.toString()

    val message = when (paymentMethod.lowercase()) {
        "нал" -> "Оплата наличными принята."
        "кредитка" -> "Введите данные вашей карты."
        "paypal" -> "Перейдите на сайт PayPal для завершения оплаты."
        else -> "Некорректный способ оплаты."
    }

    println(message)
}
