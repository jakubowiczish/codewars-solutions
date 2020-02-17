@Test.describe("Sample Test Cases")
def example_tests():
    test.assert_equals(check([66, 101], 66), True)
    test.assert_equals(check([80, 117, 115, 104, 45, 85, 112, 115], 45), True)
    test.assert_equals(check(['t', 'e', 's', 't'], 'e'), True)
    test.assert_equals(check(['what', 'a', 'great', 'kata'], 'kat'), False)