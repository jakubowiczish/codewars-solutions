namespace Solution
{
  using NUnit.Framework;
  using System.Linq;

  [TestFixture]
  public class NoOdditiesTest
  {
      [Test]
      public void OneThroughFive()
      {
          Assert.AreEqual(new int[]{2,4}, NoOddities.NoOdds(new int[]{1,2,3,4,5}));
      }
  }
}