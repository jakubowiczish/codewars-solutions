describe(`Basic tests`, _ => {
    it(`factorial(0)`, _ => {
        Test.assertEquals(factorial(0), 1);
    });
    it(`factorial(1)`, _ => {
        Test.assertEquals(factorial(1), 1);
    });
    it(`factorial(2)`, _ => {
        Test.assertEquals(factorial(2), 2);
    });
    it(`factorial(3)`, _ => {
        Test.assertEquals(factorial(3), 6);
    });
});