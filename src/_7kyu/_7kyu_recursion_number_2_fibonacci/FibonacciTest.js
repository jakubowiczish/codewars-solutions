describe(`Basic tests`, _ => {
    it(`fibonacci(1)`, _ => {
        Test.assertEquals(fibonacci(1), 1);
    });
    it(`fibonacci(2)`, _ => {
        Test.assertEquals(fibonacci(2), 1);
    });
    it(`fibonacci(3)`, _ => {
        Test.assertEquals(fibonacci(3), 2);
    });
    it(`fibonacci(4)`, _ => {
        Test.assertEquals(fibonacci(4), 3);
    });
});