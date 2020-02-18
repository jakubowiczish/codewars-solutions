test.describe("Basic Tests")
test.assert_equals(cockroach_speed(1.08),30)
test.assert_equals(cockroach_speed(1.09),30)
test.assert_equals(cockroach_speed(0),0)