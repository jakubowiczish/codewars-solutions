package _7kyu_square_every_digit;

import java.util.stream.Collectors;

class SquareDigit {

    int squareDigits(int n) {
        StringBuilder result = new StringBuilder();

        while (n != 0) {
            int digit = n % 10;
            result.insert(0, digit * digit);
            n /= 10;
        }

        return Integer.parseInt(result.toString());
    }

    int squareDigits2(int n) {
        return Integer.parseInt(String.valueOf(n)
                .chars()
                .map(c -> Integer.parseInt(String.valueOf((char) c)))
                .map(c -> c * c)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("")));
    }
}