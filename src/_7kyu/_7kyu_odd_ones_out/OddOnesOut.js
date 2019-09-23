/*
The town sheriff dislikes odd numbers and wants
all odd numbered families out of town!

In town crowds can form and individuals are
often mixed with other people and families.

However you can distinguish the family
they belong to by the number on the shirts they wear.

As the sheriff's assistant it's your job to find all the odd numbered families and remove them from the town!

Challenge:
You are given a list of numbers.

The numbers each repeat a certain number of times.

Remove all numbers that repeat an odd number of times while keeping everything else the same.
oddOnesOut([1, 2, 3, 1, 3, 3]) = [1, 1]
In the above example:

the number 1 appears twice
the number 2 appears once
the number 3 appears three times

2 and 3 both appear an odd number of times,
so they are removed from the list. The final result is: [1,1]

Here are more examples:
oddOnesOut([1, 1, 2, 2, 3, 3, 3]) = [1, 1, 2, 2]
oddOnesOut([26, 23, 24, 17, 23, 24, 23, 26]) = [26, 24, 24, 26]
oddOnesOut([1, 2, 3]) = []
oddOnesOut([1]) = []
Are you up to the challenge?
 */

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


