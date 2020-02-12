package _7kyu._7kyu_vowel_count

/*
Return the number (count) of vowels in the given string.

We will consider a, e, i, o, and u as vowels for this Kata.

The input string will only consist of lower case letters and/or spaces.
 */

fun getCount(str : String) : Int {
    return str.count{it in "aeiou"}
}
