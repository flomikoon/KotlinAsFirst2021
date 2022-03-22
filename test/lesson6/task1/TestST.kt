package lesson6.task1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TestST {
    @Test
    fun plusMinusTest() {
        assertEquals(6, plusMinus("2 + 31 - 40 + 13"))
        assertThrows(IllegalArgumentException::class.java) { plusMinus("13 + + 10") }
        assertThrows(IllegalArgumentException::class.java) { plusMinus("1 2") }

        assertEquals(15, plusMinus("2 + 13"))
        assertEquals(-11, plusMinus("2 - 13"))
        assertEquals(0, plusMinus("0"))
        assertThrows(IllegalArgumentException::class.java) { plusMinus("+10") }
        assertThrows(IllegalArgumentException::class.java) { plusMinus("- 10") }
        assertThrows(IllegalArgumentException::class.java) { plusMinus("10+") }
        assertThrows(IllegalArgumentException::class.java) { plusMinus("10 -") }
    }
}