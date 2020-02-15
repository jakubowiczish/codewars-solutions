package _7kyu._7kyu_java_functional_programming_the_beginning;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FunctionalProgrammingTest {
    @Test
    public void testJohnSmith() throws Exception {
        Student jSmith = new Student("John", "Smith", "js123");
        assertTrue("John Smith with student number js123 did not return true", FunctionalProgramming.f.apply(jSmith));
    }
}
