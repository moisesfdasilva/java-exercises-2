package sortingmethods;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * This class creates the RadixSort Method
 * @author mf-silva
 */
public class RadixSort {
    
    private static void countsort(List<Integer> list, int pos) {
        int[] countList = new int[10];
        List<Integer> outputList = Arrays.asList(new Integer[list.size()]);
        
        for (int i = 0; i < list.size(); i++) {
            countList[(list.get(i) / pos) % 10] += 1;
        }
        
        for (int i = 1; i < 10; i++) { 
            countList[i] = countList[i] + countList[i - 1];
        }
        
        for (int i = list.size() - 1; i >= 0; i--) {
            int index = (list.get(i) / pos) % 10;
            outputList.set(countList[index] - 1, list.get(i));
            countList[index] -= 1;
        }
        
        for (int i = 0; i < list.size(); i++) {
            list.set(i, outputList.get(i));
        }
    }
    
    public static void sort(List<Integer> list) {
        int max = Collections.max(list);
        
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countsort(list, exp);
        }
    }

}
