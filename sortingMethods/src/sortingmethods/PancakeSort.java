package sortingmethods;

import java.util.List;

/**
 * This class creates the PancakeSort Method.
 * @author mf-silva
 */
public class PancakeSort {
    
    private static void flip(List<Integer> list, int n) {
        int left = 0;
        
        while (left < n) {
            Util.swap(list, n, left);
            n--;
            left++;
        }
    }

    private static int maxIndex(List<Integer> list, int n) {
        int maxIdx = 0;
        
        for (int i = 0; i < n; i++) {
            if (list.get(i) > list.get(maxIdx)) {
                maxIdx = i;
            }
        }
        
        return maxIdx;
    }

    public static void sort(List<Integer> list) {
        int n = list.size(), maxIdx;
        
        while (n > 1) {
            maxIdx = maxIndex(list, n);
            
            if (maxIdx != n) {
                flip(list, maxIdx);
                flip(list, n - 1);
            }
            
            n--;
        }
    }
    
}
