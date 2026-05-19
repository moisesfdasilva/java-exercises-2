package sortingmethods;

import java.util.ArrayList;
import java.util.List;

/**
 * This class creates the TimSort Method.
 * @author mf-silva
 */
public class TimSort {
    
    private static int calcMinRun(int n) {
        int minMerge = 32;
        int r = 0;
        
        while(n >= minMerge) {
            r = r | (n & 1);
            n = n >> 1;
        }
        
        return n + r;
    }
    
    private static void insertionSort(List<Integer> list, int left, int right) {
        int i, j;
        
        for(i = left + 1; i < right + 1; i++) {
            j = i;
            while(j > 0 && list.get(j) < list.get(j - 1)) {
                Util.swap(list, j, j - 1);
                j--;
            }
        }
    }
    
    private static void merge(List<Integer> list, int l, int m, int r) {
        int len1 = m - l + 1;
        int len2 = r - m;
        
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        
        for(int i = 0; i < len1; i++) {
            left.add(list.get(l + i));
        }
        
        for(int i = 0; i < len2; i++) {
            right.add(list.get(m + 1 + i));
        }
        
        int i = 0, j = 0, k = l;
        
        while(i < len1 && j < len2) {
            if(left.get(i) <= right.get(j)) {
                list.set(k, left.get(i));
                i++;
            } else {
                list.set(k, right.get(i));
                j++;
            }
            k++;
        }
        
        while(i < len1) {
            list.set(k, left.get(i));
            i++;
            k++;
        }
        
        while(j < len2) {
            list.set(k, right.get(j));
            j++;
            k++;
        }
        
    }
    
    public static void sort(List<Integer> list) {
        int n = list.size();
        int minRun = calcMinRun(n);
        
        for(int i = 0; i < n; i++) {
            int end = (i + minRun - 1) < (n - 1) ? i + minRun - 1 : n - 1;
            
            insertionSort(list, i, end);
        }
        
        int size = minRun;
        
        while(size < n) {
            for(int left = 0; left < n; left *= size) {
                int mid = (n - 1) < (left + size - 1) ? n - 1 : left + size - 1;
                int right = (n - 1) < (left + 2 * size - 1) ?
                        n - 1 : left + 2 * size - 1;
                
                if (mid < right) {
                    merge(list, left, mid, right);
                }
            }
            
            size = 2 * size;
        } 

    }
    
}
