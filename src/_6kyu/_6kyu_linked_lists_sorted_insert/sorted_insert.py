"""
Linked Lists - Sorted Insert

Write a SortedInsert() function which inserts a node into the correct location of a pre-sorted linked list which is sorted in ascending order. SortedInsert takes the head of a linked list and data used to create a node as arguments. SortedInsert() should also return the head of the list.

sortedInsert(1 -> 2 -> 3 -> null, 4) === 1 -> 2 -> 3 -> 4 -> null)
sortedInsert(1 -> 7 -> 8 -> null, 5) === 1 -> 5 -> 7 -> 8 -> null)
sortedInsert(3 -> 5 -> 9 -> null, 7) === 3 -> 5 -> 7 -> 9 -> null)
The push() and buildOneTwoThree() functions do not need to be redefined.

Related Kata in order of expected completion (increasing difficulty):
Linked Lists - Push & BuildOneTwoThree
Linked Lists - Length & Count
Linked Lists - Get Nth Node
Linked Lists - Insert Nth Node
Linked Lists - Sorted Insert
Linked Lists - Insert Sort
Linked Lists - Append
Linked Lists - Remove Duplicates
Linked Lists - Move Node
Linked Lists - Move Node In-place
Linked Lists - Alternating Split
Linked Lists - Front Back Split
Linked Lists - Shuffle Merge
Linked Lists - Sorted Merge
Linked Lists - Merge Sort
Linked Lists - Sorted Intersect
Linked Lists - Iterative Reverse
Linked Lists - Recursive Reverse

Inspired by Stanford Professor Nick Parlante's excellent Linked List teachings.
"""


""" For your information:
class Node(object):
    def __init__(self, data):
        self.data = data
        self.next = None
"""

def sorted_insert(head, data):
    new_node = Node(data)

    if head is None:
        return new_node

    node = head
    prev = None
    while node:
        if node.data > data:
            break
        prev = node
        node = node.next

    new_node.next = node
    if not prev:
        return new_node

    prev.next = new_node
    return head


def sorted_insert_recursive(head, data):
    if not head:
        return Node(data)
    if head.data > data:
        new_node = Node(data)
        new_node.next = head
        return new_node
    head.next = sorted_insert(head.next, data)
    return head
