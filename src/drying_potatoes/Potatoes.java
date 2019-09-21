package drying_potatoes;

class Potatoes {
    static int potatoes(int p0, int w0, int p1) {
        return w0 * (100 - p0) / (100 - p1);
          /*
            Explanation:
            percentage of dry matter = (100 - p0)
            dryMatter at the beginning: dryMatter = w0 * (100 - p0) / 100
            finalWeight = dryMatter + waterFinal
            waterFinal = finalWeight * p1 / 100
            => finalWeight = w0 * (100 - p0) / (100 - p1)
          */
    }
}
