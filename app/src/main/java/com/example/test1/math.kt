package com.example.test1

class math {

fun add(a:String,b:String):String{
    var result = ""

    if (a.contains(".") || b.contains(".")) {
        result = (a.trim().toDouble() + b.trim().toDouble()).toString()
    } else if (a.contains("[A-Za-z!\\\"#\$%&'()*+,-./:;\\\\\\\\<=>?@\\\\[\\\\]^_`{|}~]".toRegex()) ||
        b.contains("[A-Za-z!\\\"#\$%&'()*+,-./:;\\\\\\\\<=>?@\\\\[\\\\]^_`{|}~]".toRegex())
    ) {
        result = "Вы ввели символы"
    } else if (a.isEmpty() || b.isEmpty()) {
        result = "Заполните поле!"
    } else{
        result = (a.trim().toInt() + b.trim().toInt()).toString()
    }
    return result
}

    fun divide(a: String, b: String): String {
        var result = ""
        if (a.contains(".") || b.contains(".")) {
            result = (a.trim().toDouble() / b.trim().toDouble()).toInt().toString()
        } else if (a.contains("[A-Za-z!\\\"#\$%&'()*+,-./:;\\\\\\\\<=>?@\\\\[\\\\]^_`{|}~]".toRegex()) ||
            b.contains("[A-Za-z!\\\"#\$%&'()*+,-./:;\\\\\\\\<=>?@\\\\[\\\\]^_`{|}~]".toRegex())
        ) {
            result = "Вы ввели символы"
        } else if (b.contains("0")) {
            result = "На ноль делить нельзя"
        } else {
            result = (a.trim().toInt() / b.trim().toInt()).toString()
        }
        return result
    }

}
