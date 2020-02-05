using System;

/*
Bob is a lazy man.

He needs you to create a method that can determine how many letters and digits are in a given string.

Example:

"hel2!lo" --> 6

"wicked .. !" --> 6

"!?..A" --> 1
*/

public static class Bob
{
    public static int CountLettersAndDigits(string input)
    {
        int counter = 0;
        for (int i = 0; i < input.Length; ++i) {
          if (Char.IsLetterOrDigit(input[i])) {
            ++counter;
          }
        }

        return counter;
    }
}