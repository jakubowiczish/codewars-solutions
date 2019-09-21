function findDifference(a, b) {
    return Math.abs(a.reduce((acc, n) => acc * n) - b.reduce((acc, n) => acc * n));
}



// exit code 0 -> test passed
var assert = require('assert');

describe("Tests", function () {
    it("Basic tests", function () {
        assert.strictEqual(findDifference([3, 2, 5], [1, 4, 4]), 14);
        assert.strictEqual(findDifference([9, 7, 2], [5, 2, 2]), 106);
        assert.strictEqual(findDifference([11, 2, 5], [1, 10, 8]), 30);
        assert.strictEqual(findDifference([4, 4, 7], [3, 9, 3]), 31);
        assert.strictEqual(findDifference([15, 20, 25], [10, 30, 25]), 0);
    });
});


