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
      Assert.That(Kata.DivisibleByThree("1891009"), Is.EqualTo(false));
      Assert.That(Kata.DivisibleByThree("00009"), Is.EqualTo(true));
      Assert.That(Kata.DivisibleByThree("57"), Is.EqualTo(true));
    }
  }
}