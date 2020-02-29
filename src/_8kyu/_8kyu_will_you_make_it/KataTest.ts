/// <reference path="/runner/typings/mocha/index.d.ts" />
/// <reference path="/runner/typings/chai/index.d.ts" />
import {zeroFuel} from "./solution";
import {assert} from "chai";

describe("zeroFill", function() {
    it("Sample Tests", function() {
        assert.equal(zeroFuel(50, 25, 2), true);
        assert.equal(zeroFuel(100, 50, 1), false);
    });
});