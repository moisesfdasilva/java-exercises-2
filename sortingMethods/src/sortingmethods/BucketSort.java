package sortingmethods;

import java.util.Arrays;
import java.util.List;

/**
 * This class creates the BucketSort Method
 * @author mf-silva
 */
public class BucketSort {
    private static int getMax(List<Integer> list) {
        int max = list.get(0);
        
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        
        return max;
    }
    
    public static void sort(List<Integer> list) {
        int max = getMax(list);
        
        List<Integer> bucket = Arrays.asList(new Integer[max + 1]);
        
        for (int i = 0; i <= max; i++) {
            bucket.set(i, 0);
        }
        for (int i = 0; i < list.size(); i++) {
            bucket.set(list.get(i), bucket.get(list.get(i)) + 1);
        }
        for (int i = 0, j = 0; i <= max; i++) {
            while (bucket.get(i) > 0) {
                list.set(j, i);
                j++;
                bucket.set(i, bucket.get(i) - 1);
            }
        }
    }
    
}
