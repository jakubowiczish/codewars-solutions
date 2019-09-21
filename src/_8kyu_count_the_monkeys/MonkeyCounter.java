package _8kyu_count_the_monkeys;

import java.util.stream.*;

class MonkeyCounter {

    static int[] monkeyCount(final int n) {
        return IntStream.rangeClosed(1, n).toArray();
    }

    static int[] monkeyCount2(final int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; ++i) {
            result[i] = i + 1;
        }

        return result;
    }
}
