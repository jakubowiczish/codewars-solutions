function oddOnesOut(nums) {
    return nums.filter(num => nums.filter(n => n === num).length % 2 === 0);
}

const { assert } = require('chai');

describe("Fixed tests", function() {
    it("Testing for [1, 2, 3, 1, 3, 3]", function() {
        assert.deepEqual(oddOnesOut([1, 2, 3, 1, 3, 3]), [1, 1]);
    });
    it("Testing for [75, 68, 75, 47, 68]", function() {
        assert.deepEqual(oddOnesOut([75, 68, 75, 47, 68]), [75, 68, 75, 68]);
    });
    it("Testing for [42, 72, 32, 4, 94, 82, 67, 67]", function() {
        assert.deepEqual(oddOnesOut([42, 72, 32, 4, 94, 82, 67, 67]), [67, 67]);
    });
    it("Testing for [100, 100, 5, 5, 100, 50, 68, 50, 68, 50, 68, 5, 100]", function() {
        assert.deepEqual(oddOnesOut([100, 100, 5, 5, 100, 50, 68, 50, 68, 50, 68, 5, 100]), [100, 100, 100, 100]);
    });
    it("Testing for [82, 86, 71, 58, 44, 79, 50, 44, 79, 67, 82, 82, 55, 50]", function() {
        assert.deepEqual(oddOnesOut([82, 86, 71, 58, 44, 79, 50, 44, 79, 67, 82, 82, 55, 50]), [44, 79, 50, 44, 79, 50]);
    });
});


