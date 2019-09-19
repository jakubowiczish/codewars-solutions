function findDifference(a, b) {
    return Math.abs(a.reduce((acc, n) => acc * n) - b.reduce((acc, n) => acc * n));
}

describe("Tests", function () {
    it("Basic tests", function () {
        Test.assertEquals(findDifference([3, 2, 5], [1, 4, 4]), 14);
        Test.assertEquals(findDifference([9, 7, 2], [5, 2, 2]), 106);
        Test.assertEquals(findDifference([11, 2, 5], [1, 10, 8]), 30);
        Test.assertEquals(findDifference([4, 4, 7], [3, 9, 3]), 31);
        Test.assertEquals(findDifference([15, 20, 25], [10, 30, 25]), 0);
    });
});


