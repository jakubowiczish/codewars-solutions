namespace Solution {
	using NUnit.Framework;
	using System;

	[TestFixture]
	public class RecursionTests { [Test]
		public void BasicTests() {
			Assert.AreEqual(1, Recursion.Factorial(0));
			Assert.AreEqual(1, Recursion.Factorial(1));
			Assert.AreEqual(2, Recursion.Factorial(2));
			Assert.AreEqual(6, Recursion.Factorial(3));
		}
	}
}