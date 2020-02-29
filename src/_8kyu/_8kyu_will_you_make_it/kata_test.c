#include <stdbool.h>
#include <criterion/criterion.h>

void test_zero_fuel(double distance_to_pump, double mpg, double fuel_left, bool expected);

Test(zero_fuel, should_pass_example_tests)
{
    test_zero_fuel(50, 25, 2, true);
    test_zero_fuel(60, 30, 3, true);
    test_zero_fuel(70, 25, 1, false);
    test_zero_fuel(100, 25, 3, false);
}
