function solve(s) {
    const splittedVowels = s.replace(/[^aeiou]/ig, " ").split(" ");

    var maxLength = 0;
    splittedVowels.forEach(function (elem) {
        maxLength = Math.max(elem.length, maxLength);
    });

    return maxLength;
}

describe("Basic tests", function () {
    Test.assertEquals(solve("codewarriors"), 2);
    Test.assertEquals(solve("suoidea"), 3);
    Test.assertEquals(solve("ultrarevolutionariees"), 3);
    Test.assertEquals(solve("strengthlessnesses"), 1);
    Test.assertEquals(solve("cuboideonavicuare"), 2);
    Test.assertEquals(solve("chrononhotonthuooaos"), 5);
    Test.assertEquals(solve("iiihoovaeaaaoougjyaw"), 8);
});