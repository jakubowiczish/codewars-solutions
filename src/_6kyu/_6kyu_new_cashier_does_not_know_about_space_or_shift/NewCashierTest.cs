using NUnit.Framework;
using System;
[TestFixture]
public class OrderTest { [Test]
	public void Test1() {
		Assert.AreEqual("Burger Fries Chicken Pizza Pizza Pizza Sandwich Milkshake Milkshake Coke", Kata.GetOrder("milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizza"));
	}

	[Test]
	public void Test2() {
		Assert.AreEqual("Burger Fries Fries Chicken Pizza Sandwich Milkshake Coke", Kata.GetOrder("pizzachickenfriesburgercokemilkshakefriessandwich"));
	}
}