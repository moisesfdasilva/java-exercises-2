package sortingmethods;

import java.util.List;

/**
 * This class creates the StoogeSort Method
 * @author mf-silva
 */
public class StoogeSort {
    
    private static void stoogeSort(List<Integer> list, int i, int j) {
        int k;
        
        if (list.get(i) > list.get(j)) {
            Util.swap(list, i, j);
        }
        
        if ((i + 1) >= j) {
            return;
        }
        
        k = (int)((j - i + 1) / 3);
        
        stoogeSort(list, i, j - k);
        stoogeSort(list, i + k, j);
        stoogeSort(list, i, j - k);
    }
    
    public static void sort(List<Integer> list) {
        int n = list.size() - 1;
        
        stoogeSort(list, 0, n);
    }
    
}
