function expressionMatter(a, b, c) {
    return Math.max(a + b + c, a * (b + c), (a + b) * c, a * b * c);
}

describe("Small values", function() {
    Test.assertEquals(expressionMatter(2, 1, 2), 6);
    Test.assertEquals(expressionMatter(2, 1, 1), 4);
    Test.assertEquals(expressionMatter(1, 1, 1), 3);
    Test.assertEquals(expressionMatter(1, 2, 3), 9);
    Test.assertEquals(expressionMatter(1, 3, 1), 5);
    Test.assertEquals(expressionMatter(2, 2, 2), 8);
});

describe("Medium values", function() {
    Test.assertEquals(expressionMatter(5, 1, 3), 20);
    Test.assertEquals(expressionMatter(3, 5, 7), 105);
    Test.assertEquals(expressionMatter(5, 6, 1), 35);
    Test.assertEquals(expressionMatter(1, 6, 1), 8);
    Test.assertEquals(expressionMatter(2, 6, 1), 14);
    Test.assertEquals(expressionMatter(6, 7, 1), 48);
});

describe("Mixed values", function() {
    Test.assertEquals(expressionMatter(2, 10, 3), 60);
    Test.assertEquals(expressionMatter(1, 8, 3), 27);
    Test.assertEquals(expressionMatter(9, 7, 2), 126);
    Test.assertEquals(expressionMatter(1, 1, 10), 20);
    Test.assertEquals(expressionMatter(9, 1, 1), 18);
    Test.assertEquals(expressionMatter(10, 5, 6), 300);
    Test.assertEquals(expressionMatter(1, 10, 1), 12);
});