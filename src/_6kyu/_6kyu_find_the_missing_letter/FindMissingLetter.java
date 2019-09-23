package _6kyu._6kyu_find_the_missing_letter;

/*
#Find the missing letter

Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.

You will always get an valid array. And it will be always exactly one letter be missing. The length of the array will always be at least 2.
The array will always contain letters in only one case.

Example:

['a','b','c','d','f'] -> 'e'
['O','Q','R','S'] -> 'P'
(Use the English alphabet with 26 letters!)

Have fun coding it and please don't forget to vote and rank this kata! :-)

I have also created other katas. Take a look if you enjoyed this kata!
 */

class FindMissingLetter {

    static char findMissingLetter(char[] array) {
        for (int i = 1; i < array.length; ++i) {
            if (array[i - 1] + 1 != array[i]) {
                return (char) (array[i - 1] + 1);
            }
        }

        throw new IllegalArgumentException("Array should have missing letter, invalid argument!");
    }
}
