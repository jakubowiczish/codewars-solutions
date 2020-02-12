package _4kyu._4kyu_range_extraction;

import java.util.ArrayList;
import java.util.List;

public class RangeExtraction {

    public static String rangeExtraction(int[] arr) {
        List<String> outputList = new ArrayList<>();
        int rangingCounter;
        for (int i = 0; i < arr.length; ) {
            rangingCounter = 0;
            String start = String.valueOf(arr[i]);
            while (i != arr.length - 1 && arr[i + 1] - arr[i] == 1) {
                ++rangingCounter;
                ++i;
            }

            if (rangingCounter > 0) {
                if (rangingCounter > 1) start += "-" + (Integer.parseInt(start) + rangingCounter);
                else --i;
            }
            outputList.add(start);
            ++i;
        }

        return String.join(",", outputList);
    }
}

