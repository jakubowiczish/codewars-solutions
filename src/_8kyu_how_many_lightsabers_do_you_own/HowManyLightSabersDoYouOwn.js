function howManyLightsabersDoYouOwn(name) {
    return name === "Zach" ? 18 : 0;
}

Test.assertEquals( howManyLightsabersDoYouOwn(), 0 )
Test.assertEquals( howManyLightsabersDoYouOwn("Adam"), 0 )
Test.assertEquals( howManyLightsabersDoYouOwn("Zach"), 18 )