namespace Solution {
  using NUnit.Framework;
  using System;

  [TestFixture]
  public class BigNumbersAdderTest
  {
    [Test]
    public void MyTest()
    {
      Assert.AreEqual("99999", Kata.Add("99998", "1"));
      Assert.AreEqual("999999999999999999999999999999", Kata.Add("999999999999999999999999999998", "1"));
    }
  }
}