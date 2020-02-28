## Solution for problem:

https://www.codewars.com/kata/linked-lists-alternating-split/

## Instructions

Linked Lists - Alternating Split

Write an AlternatingSplit() function that takes one 
list and divides up its nodes to make two smaller lists. 
The sublists should be made from alternating elements 
in the original list. 
So if the original list is a -> b -> a -> b -> a -> null 
then one sublist should be a -> a -> a -> null
and the other should be b -> b -> null.

###JavaScript
```
var list = 1 -> 2 -> 3 -> 4 -> 5 -> null
alternatingSplit(list).first === 1 -> 3 -> 5 -> null
alternatingSplit(list).second === 2 -> 4 -> null
```
###Python
```
list = 1 -> 2 -> 3 -> 4 -> 5 -> None
alternating_split(list).first == 1 -> 3 -> 5 -> None
alternating_split(list).second == 2 -> 4 -> None
```
###Ruby
```
list = 1 -> 2 -> 3 -> 4 -> 5 -> nil
alternating_split(list).first == 1 -> 3 -> 5 -> nil
alternating_split(list).second == 2 -> 4 -> nil
```
For simplicity, we use a Context object to store and return the state of the two linked lists. A Context object containing the two mutated lists should be returned by AlternatingSplit().

If the passed in head node is null/None/nil or a single node, throw an error.

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