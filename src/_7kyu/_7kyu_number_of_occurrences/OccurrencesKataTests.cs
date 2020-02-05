using NUnit.Framework;

[TestFixture]
public class OccurrencesKataTests
{
  [Test]
  public void Should_Work_On_Empty_List()
  {
  	Assert.AreEqual(0,
    	OccurrencesKata.NumberOfOccurrences(2, new int[0]));
  }

  [Test]
  public void Should_Work_On_Examples()
  {
  	var example = new int[] { 4, 0, 4 };

    Assert.AreEqual(2,
    	OccurrencesKata.NumberOfOccurrences(4, example));

    Assert.AreEqual(0,
    	OccurrencesKata.NumberOfOccurrences(1, example));

    Assert.AreEqual(1,
    	OccurrencesKata.NumberOfOccurrences(0, example));
  }
}