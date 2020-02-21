namespace Solution
{
  using NUnit.Framework;
  using System;

  [TestFixture]
  public class Sample_Test
  {
    [Test]
    public void Test()
    {
      Assert.AreEqual(new int[] {1, 2, 1, 1, 3, 1, 0, 0, 0, 0}, Kata.MoveZeroes(new int[] {1, 2, 0, 1, 0, 1, 0, 3, 0, 1}));
    }
  }
}