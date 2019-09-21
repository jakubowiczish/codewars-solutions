function goals(laLigaGoals, copaDelReyGoals, championsLeagueGoals) {
    return laLigaGoals + copaDelReyGoals + championsLeagueGoals;
}

// exit code 0 -> test passed
var assert = require('assert');
assert.strictEqual(goals(0, 0, 0), 0);
assert.strictEqual(goals(43, 10, 5), 58);