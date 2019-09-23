package _8kyu._8kyu_expressions_matter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExpressionsMatterTest {

    @Test
    void checkSmallValues() {
        assertEquals(6, ExpressionsMatter.expressionsMatter(2, 1, 2));
        assertEquals(3, ExpressionsMatter.expressionsMatter(1, 1, 1));
        assertEquals(4, ExpressionsMatter.expressionsMatter(2, 1, 1));
        assertEquals(9, ExpressionsMatter.expressionsMatter(1, 2, 3));
        assertEquals(5, ExpressionsMatter.expressionsMatter(1, 3, 1));
        assertEquals(8, ExpressionsMatter.expressionsMatter(2, 2, 2));
    }

    @Test
    void checkIntermediateValues() {
        assertEquals(20, ExpressionsMatter.expressionsMatter(5, 1, 3));
        assertEquals(105, ExpressionsMatter.expressionsMatter(3, 5, 7));
        assertEquals(35, ExpressionsMatter.expressionsMatter(5, 6, 1));
        assertEquals(8, ExpressionsMatter.expressionsMatter(1, 6, 1));
        assertEquals(14, ExpressionsMatter.expressionsMatter(2, 6, 1));
        assertEquals(48, ExpressionsMatter.expressionsMatter(6, 7, 1));
    }

    @Test
    void checkMixedValues() {
        assertEquals(60, ExpressionsMatter.expressionsMatter(2, 10, 3));
        assertEquals(27, ExpressionsMatter.expressionsMatter(1, 8, 3));
        assertEquals(126, ExpressionsMatter.expressionsMatter(9, 7, 2));
        assertEquals(20, ExpressionsMatter.expressionsMatter(1, 1, 10));
        assertEquals(18, ExpressionsMatter.expressionsMatter(9, 1, 1));
        assertEquals(300, ExpressionsMatter.expressionsMatter(10, 5, 6));
        assertEquals(12, ExpressionsMatter.expressionsMatter(1, 10, 1));
    }
}
