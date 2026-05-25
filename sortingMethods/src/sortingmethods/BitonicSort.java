package sortingmethods;

import java.util.List;

/**
 * This class creates the BitonicSort Method
 * @author mf-silva
 */
public class BitonicSort {
    
    private final static boolean ASCENDING=true, DESCENDING=false;
    
    private static void bitonicMerge(List<Integer> list, int lo, int n,
            boolean dir) {
        if (n > 1) {
            int k = n / 2;
            
            for (int i = lo; i < lo + k; i++) {
                if (dir == (list.get(i) > list.get(i + k))) {
                    Util.swap(list, i, i + k);
                }
            }
            
            bitonicMerge(list, lo, k, dir);
            bitonicMerge(list, lo + k, k, dir);
        }
    }
    
    private static void bitonicSort(List<Integer> list, int lo, int n,
            boolean dir) {
        if (n > 1) {
            int k = n / 2;
            
            bitonicSort(list, lo, k, ASCENDING);
            bitonicSort(list, lo + k, k, DESCENDING);
            bitonicMerge(list, lo, n, dir);
        }
    }
    
    public static void sort(List<Integer> list) {
        bitonicSort(list, 0, list.size(), ASCENDING);
    }
    
}
