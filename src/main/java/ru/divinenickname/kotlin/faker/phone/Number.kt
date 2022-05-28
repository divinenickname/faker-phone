package ru.divinenickname.kotlin.faker.phone

import kotlin.random.Random

class Number(private val format: String) {

    private val size = format.length
    val number = generate()

    private fun generate(): String {
        val str = StringBuilder(size)
        for (position in 0 until size) {
            val char = format[position]
            val strChar = if (char == '#') {
                Random.nextInt(0, 9).toString()
            } else {
                if (CharRange('0', '9').contains(char)) {
                    (char.code - '0'.code).toString()
                } else {
                    char.toString()
                }
            }
            str.append(strChar)
        }

        return str.toString()
    }
}