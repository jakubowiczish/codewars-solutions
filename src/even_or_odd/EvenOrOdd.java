package even_or_odd;

class EvenOrOdd {
    static String evenOrOdd(int number) {
        return (number & 1) == 0 ? "Even" : "Odd";
    }
}