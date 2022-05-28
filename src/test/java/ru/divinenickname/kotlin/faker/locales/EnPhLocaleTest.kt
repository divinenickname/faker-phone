package ru.divinenickname.kotlin.faker.locales

import org.junit.jupiter.api.Test
import java.util.*

class EnPhLocaleTest() : CommonTest(Locale("PH")) {

    private val locale: Locale = Locale("PH")

    @Test
    override fun numberLengthTest() {
        super.numberLengthTest(10)
    }

    @Test
    override fun internationalNumberCodeTest() {
        super.internationalNumberCodeTest("+63")
    }

    @Test
    override fun internationalNumberLengthTest() {
        super.internationalNumberLengthTest(13)
    }

    @Test
    override fun trunkNumberLengthTest() {
        super.trunkNumberLengthTest(11)
    }

    @Test
    override fun trunkNumberCodeTest() {
        super.trunkNumberCodeTest("0")
    }
}