package _6kyu._6kyu_find_the_parity_outlier

import org.junit.Test

import org.junit.jupiter.api.Assertions.assertEquals


class FindTheParityOutlierTest {

    @Test
    fun testExample() {
        val exampleTest1 = arrayOf(2, 6, 8, -10, 3)
        val exampleTest2 = arrayOf(206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781)
        val exampleTest3 = arrayOf(Integer.MAX_VALUE, 0, 1)
        assertEquals(3, find(exampleTest1))
        assertEquals(206847684, find(exampleTest2))
        assertEquals(0, find(exampleTest3))
    }
}