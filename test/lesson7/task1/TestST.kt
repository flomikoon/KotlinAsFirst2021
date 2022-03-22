package lesson7.task1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.io.File

class TestST {
    @Test
    fun countSubstringsTest() {
        assertEquals(
            mapOf("Hello" to 2, "Привет" to 2),
            countSubstrings("input/substring_test_1.txt", listOf("Привет", "Hello"))
        )

        assertNotEquals(
            mapOf("Hello" to 1, "Привет" to 2),
            countSubstrings("input/substring_test_1.txt", listOf("Привет", "Hello"))
        )

        assertEquals(
            mapOf("+" to 3, "Hello" to 2, "." to 5, "test" to 0),
            countSubstrings("input/substring_test_1.txt", listOf("+", "Hello", ".", "test"))
        )
    }
}