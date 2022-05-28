package ru.divinenickname.kotlin.faker.locales

import org.junit.jupiter.api.Test
import java.util.*

class RuLocaleTest : CommonTest(Locale("ru")) {

    @Test
    override fun numberLengthTest() {
        super.numberLengthTest(10)
    }

    @Test
    override fun internationalNumberCodeTest() {
        super.internationalNumberCodeTest("+7")
    }

    @Test
    override fun internationalNumberLengthTest() {
        super.internationalNumberLengthTest(12)
    }

    @Test
    override fun trunkNumberLengthTest() {
        super.trunkNumberLengthTest(11)
    }

    @Test
    override fun trunkNumberCodeTest() {
        super.trunkNumberCodeTest("8")
    }
}