package _7kyu._7kyu_vowel_count

import org.junit.Test
import org.junit.Assert.assertEquals

class TestExample {

    @Test
    fun testFixed() {
        assertEquals(5, getCount("abracadabra"))
        assertEquals(1, getCount("test"))
        assertEquals(3, getCount("example"))
    }
}