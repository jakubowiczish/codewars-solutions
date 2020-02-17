@test.describe('Fixed Tests')
def fixed_tests():

    @test.it('Example tests')
    def basic_tests():
        test.assert_equals(small_enough([66, 101], 200), True)
        test.assert_equals(small_enough([78, 117, 110, 99, 104, 117, 107, 115], 100), False)
        test.assert_equals(small_enough([101, 45, 75, 105, 99, 107], 107), True)
        test.assert_equals(small_enough([80, 117, 115, 104, 45, 85, 112, 115], 120), True)