namespace Solution
{
  using NUnit.Framework;
  using System;

  [TestFixture]
  public class SolutionTest
  {
    [Test]
    public void SampleTest()
    {
      Assert.AreEqual(true, Kata.ZeroFuel(50, 25, 2));
      Assert.AreEqual(false, Kata.ZeroFuel(100, 50, 1));
    }
  }
}