def push(head, data):
    newNode = Node(data)
    newNode.next = head
    return newNode

def build_one_two_three():
    head = None
    head = push(head, 3)
    head = push(head, 2)
    head = push(head, 1)
    return head

def build_one_two():
    head = None
    head = push(head, 2)
    head = push(head, 1)
    return head

def build_one_two_three_four_five_six():
    head = None
    head = push(head, 6)
    head = push(head, 5)
    head = push(head, 4)
    head = push(head, 3)
    head = push(head, 2)
    head = push(head, 1)
    return head

def build_list(data):
    data.reverse()
    head = None
    for num in data:
        head = push(head, num)
    return head

def assert_linked_list_equals(listA, listB, message):
    while listA is not None and listB is not None:
        test.assert_equals(listA.data, listB.data, message)
        listA = listA.next
        listB = listB.next
    test.assert_equals(listA, None, message)
    test.assert_equals(listB, None, message)

test.it("should be able to handle an empty list.")
test.expect_error("splitting a None list should throw an error.", lambda : alternating_split(None))

test.it("should be able to handle a list of length 1.")
test.expect_error("splitting a single node list should throw an error.", lambda : alternating_split(Node(23)))

test.it("should be able to handle a list of length 2.")
test.assert_equals(alternating_split(build_one_two()).first.data, 1, "First index of first linked list should have value of 1.")
test.assert_equals(alternating_split(build_one_two()).first.next, None, "Second index of first linked list should be None.")
test.assert_equals(alternating_split(build_one_two()).second.data, 2, "First index of second linked list should have value of 2.")
test.assert_equals(alternating_split(build_one_two()).second.next, None, "Second index of second linked list should be None.")

test.it("should be able to handle a list of length 3")
test.assert_equals(alternating_split(build_one_two_three()).first.data, 1, "First index of first linked list should have value of 1.")
test.assert_equals(alternating_split(build_one_two_three()).first.next.data, 3, "Second index of first linked list should have value 3.")
test.assert_equals(alternating_split(build_one_two_three()).first.next.next, None, "Third index of first linked list should be None.")
test.assert_equals(alternating_split(build_one_two_three()).second.data, 2, "First index of second linked list should have value of 2.")
test.assert_equals(alternating_split(build_one_two_three()).second.next, None, "Second index of second linked list should be None.")

test.it("should be able to handle a list of length 6")
assert_linked_list_equals(alternating_split(build_one_two_three_four_five_six()).first, build_list([1, 3, 5]), "First list of alternating_split(1 -> 2 -> 3 -> ... 6 -> None) should be 1 -> 3 -> 5 -> None")
assert_linked_list_equals(alternating_split(build_one_two_three_four_five_six()).second, build_list([2, 4, 6]), "Second list of alternating_split(1 -> 2 -> 3 -> ... 6 -> None) should be 2 -> 4 -> 6 -> None")
test.assert_equals(alternating_split(build_one_two_three_four_five_six()).first.next.next.next, None, "Fourth index of first linked list should be None.")
test.assert_equals(alternating_split(build_one_two_three_four_five_six()).second.next.next.next, None, "Fourth index of second linked list should be None.")

test.it("should be able to handle a list of length 11")
assert_linked_list_equals(alternating_split(build_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11])).first, build_list([1, 3, 5, 7, 9, 11]), "First list of alternating_split(1 -> 2 -> 3 -> ... 11 -> None) should be 1 -> 3 -> 5 -> 7 -> 9 -> 11 -> None")
assert_linked_list_equals(alternating_split(build_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11])).second, build_list([2, 4, 6, 8, 10]), "Second list of alternating_split(1 -> 2 -> 3 -> ... 11 -> None) should be 2 -> 4 -> 6 -> 8 -> 10 -> None")
assert_linked_list_equals(alternating_split(build_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11])).first.next.next.next.next.next.next, None, "Seventh index of first linked list should be None.")
assert_linked_list_equals(alternating_split(build_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11])).second.next.next.next.next.next, None, "Sixth index of second linked list should be None.")

test.it("should be able to handle are large unordered list.")
assert_linked_list_equals(alternating_split(build_list([5, 6, 1, 2, 3, 3, 3, 4, 8, 5, 4, 1])).first, build_list([5, 1, 3, 3, 8, 4]), "First list of alternating_split(5 -> 6 -> 1 -> 2 -> 3 -> 3 -> 3 -> 4 -> 8 -> 5 -> 4 -> 1 -> None) should be 5 -> 1 -> 3 -> 3 -> 8 -> 4 -> None")
assert_linked_list_equals(alternating_split(build_list([5, 6, 1, 2, 3, 3, 3, 4, 8, 5, 4, 1])).second, build_list([6, 2, 3, 4, 5, 1]), "Second list of alternating_split(5 -> 6 -> 1 -> 2 -> 3 -> 3 -> 3 -> 4 -> 8 -> 5 -> 4 -> 1 -> None) should be 6 -> 2 -> 3 -> 4 -> 5 -> -> 1 -> None")
assert_linked_list_equals(alternating_split(build_list([5, 6, 1, 2, 3, 3, 3, 4, 8, 5, 4, 1])).first.next.next.next.next.next.next, None, "Seventh index of first linked list should be None.")
assert_linked_list_equals(alternating_split(build_list([5, 6, 1, 2, 3, 3, 3, 4, 8, 5, 4, 1])).second.next.next.next.next.next.next, None, "Seventh index of second linked list should be None.")