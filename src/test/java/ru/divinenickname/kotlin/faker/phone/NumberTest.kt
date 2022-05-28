package ru.divinenickname.kotlin.faker.phone

import io.kotest.matchers.char.shouldBeInRange
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.Test

class NumberTest {

    @Test
    fun digitTest() {
        val number = Number("#1#3###")
        val actual = number.number

        for (char in actual) {
            char shouldBeInRange CharRange('0', '9')
        }
    }

    @Test
    fun definedNumberTest() {
        val number = Number("#1#3####")
        val actual = number.number

        actual[1] shouldBe '1'
        actual[3] shouldBe '3'
    }

    @Test
    fun sizeTest() {
        val number = Number("#1#3####")
        val actual = number.number

        actual.length shouldBe 8
    }

}