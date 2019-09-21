package _7kyu_growth_of_a_population;

class Arge {

    static int nbYear(int p0, double percent, int aug, int p) {
        int counter = 0;

        while (p > p0) {
            p0 += p0 * percent * 0.01 + aug;
            ++counter;
        }

        return counter;
    }
}