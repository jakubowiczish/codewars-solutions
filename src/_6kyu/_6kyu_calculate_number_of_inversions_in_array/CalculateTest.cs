namespace Solution
{
  using NUnit.Framework;
  using System;

  [TestFixture]
  public class CalculateTest
  {
    [Test]
    public void BasicTests()
    {
      Assert.AreEqual(0, Kata.CountInversions(new int[] { 1, 2, 3 }), "Sorted array has 0 inversions");
      Assert.AreEqual(1, Kata.CountInversions(new int[] { 2, 1, 3 }), "Array [2,1,3] only has one inversion");
    }
  }
}