package lesson5.task1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TestST {
    @Test
    fun findSumOfTwoTest() {
        assertEquals(Pair(0, 2), findSumOfTwo(listOf(1, 2, 3), 4))
        assertNotEquals(Pair(0, 2), findSumOfTwo(listOf(1, 2, 3), 6))
        assertEquals(Pair(-1, -1), findSumOfTwo(listOf(1, 2, 3), 6))
        assertNotEquals(Pair(2, 0), findSumOfTwo(listOf(1, 2, 3), 4))

        assertEquals(Pair(-1, -1), findSumOfTwo(emptyList(), 0))
        assertEquals(Pair(-1, -1), findSumOfTwo(listOf(0), 0))
        assertEquals(Pair(0, 1), findSumOfTwo(listOf(0, 0), 0))

        assertEquals(Pair(-1, -1), findSumOfTwo(listOf(1, 2, 3, 0, 3, 5, 8), 0))
        assertEquals(Pair(3, 7), findSumOfTwo(listOf(1, 2, 3, 0, 3, 5, 8, 0), 0))
        assertNotEquals(Pair(-1, -1), findSumOfTwo(listOf(1, 2, 3, 0, 3, 5, 8, 0), 0))

        assertEquals(Pair(-1, -1), findSumOfTwo(listOf(1, 2, 3, 0, 3, 5, 8, 0), -1))
    }
}