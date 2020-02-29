Describe(zero_fuel_function)
{
    It(should_pass_sample_tests)
    {
        Assert::That(zero_fuel(50, 25, 2), Equals(true));
        Assert::That(zero_fuel(100, 50, 1), Equals(false));
    }
};