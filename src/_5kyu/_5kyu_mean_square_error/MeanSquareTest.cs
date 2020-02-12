namespace Solution
{
  using NUnit.Framework;
  using System;

  [TestFixture]
  public class MeanSquareTest
  {
    [Test, Description("Sample Tests")]
    public void SampleTest()
    {
      Assert.AreEqual(9,    MeanSquare.Solution(new int[] {1, 2, 3}, new int[] {4, 5, 6}));
      Assert.AreEqual(16.5, MeanSquare.Solution(new int[] {10, 20, 10, 2}, new int[] {10, 25, 5, -2}));
      Assert.AreEqual(1,    MeanSquare.Solution(new int[] {0, -1}, new int[] {-1, 0}));
    }
  }
}