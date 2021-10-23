package com.adebayoabdulbasit.challenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SmallestPositive {
    public int smallestMissingNo(int[] array) {
        Map<Integer, Integer> listMap = new HashMap<>();
        Arrays.stream(array).forEach(lst -> {
            int count = listMap.containsKey(lst) ? listMap.get(lst) + 1 : 1;
            listMap.put(lst, count);
        });

        for (int element : array) {
            int missingElement = element + 1;
            if (missingElement > 0) {
                if (!listMap.containsKey(missingElement)) {
                    return missingElement;
                }
            }
        }
        return 1;
    }
}
