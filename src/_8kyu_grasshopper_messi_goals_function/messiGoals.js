/*
Messi goals function
Messi is a soccer player with goals in three leagues:

LaLiga
Copa del Rey
Champions.
Complete the goals function to return his total goals (the sum) for all three leagues.

Note: the parameter for this function will always be a valid number.

Ex :
goals(5,10,2) == 5+10+2 = 17

 */

function goals(laLigaGoals, copaDelReyGoals, championsLeagueGoals) {
    return laLigaGoals + copaDelReyGoals + championsLeagueGoals;
}

// exit code 0 -> test passed
var assert = require('assert');
assert.strictEqual(goals(0, 0, 0), 0);
assert.strictEqual(goals(43, 10, 5), 58);