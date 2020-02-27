test.describe("tests for counting the length of a linked list.")
list = build_one_two_three()
test.assert_equals(length(None), 0, "Length of null list should be zero.")
test.assert_equals(length(Node(99)), 1, "Length of single node list should be one.")
test.assert_equals(length(list), 3, "Length of the three node list should be three.")

test.describe("tests for counting occurrences of a particular integer in a linked list.")
list = build_one_two_three();
test.assert_equals(count(list, 1), 1, "list should only contain one 1.")
test.assert_equals(count(list, 2), 1, "list should only contain one 2.")
test.assert_equals(count(list, 3), 1, "list should only contain one 3.")
test.assert_equals(count(list, 99), 0, "list should return zero for integer not found in list.")
test.assert_equals(count(None, 1), 0, "null list should always return count of zero.")