function getAges(sum, difference) {
    if (sum < 0 || difference < 0) return null;
    var first = (sum + difference) / 2;
    var second = (sum - difference) / 2;
    if (first < 0 || second < 0) return null;
    return [first, second];
};

Test.describe('Calculating Individual Ages ', function () {
    it("it returns 14,10 when passed 24,4", function () {
        Test.assertSimilar(getAges(24, 4), [14, 10]);
    });
    it("it returns null when passed 63,-14", function () {
        Test.assertSimilar(getAges(63, -14), null);
    });
});