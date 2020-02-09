Test.describe("Basic tests", _ => {
    Test.assertEquals(superSize(69), 96);
    Test.assertEquals(superSize(513), 531);
    Test.assertEquals(superSize(2017), 7210);
    Test.assertEquals(superSize(414), 441);
    Test.assertEquals(superSize(608719), 987610);
    Test.assertEquals(superSize(123456789), 987654321);
    Test.assertEquals(superSize(700000000001), 710000000000);
    Test.assertEquals(superSize(666666), 666666);
    Test.assertEquals(superSize(2), 2)
});