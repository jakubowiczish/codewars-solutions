package _8kyu._8kyu_even_or_odd;

/*
Create a function (or write a script in Shell)
that takes an integer as an argument and returns
"Even" for even numbers or "Odd" for odd numbers.
 */

class EvenOrOdd {
    static String evenOrOdd(int number) {
        return (number & 1) == 0 ? "Even" : "Odd";
    }
}