package maximum_multiple;

class MaxMultiple {

    static int maxMultiple(int divisor, int bound) {
        for (int i = bound; i > 0; --i) {
            if (i % divisor == 0) return i;
        }

        return 1;
    }

    // better solution

    static int maxMultiple2(int divisor, int bound) {
        return bound - (bound % divisor);
    }

}

