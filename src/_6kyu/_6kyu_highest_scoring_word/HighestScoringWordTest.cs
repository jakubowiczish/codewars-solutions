namespace Solution {
	using NUnit.Framework;
	using System;
	using System.Collections.Generic;

	[TestFixture]
	public class Sample_Tests {
		private static IEnumerable < TestCaseData > testCases {
			get {
				yield
				return new TestCaseData("man i need a taxi up to ubud").Returns("taxi");
				yield
				return new TestCaseData("what time are we climbing up to the volcano").Returns("volcano");
				yield
				return new TestCaseData("take me to semynak").Returns("semynak");
			}
		}

		[Test, TestCaseSource("testCases")]
		public string Test(string s) = >Kata.High(s);
	}
}