package sortingmethods;

import java.util.List;

/**
 * This class creates the InsertionSort Method
 * @author mf-silva
 */
public class InsertionSort {
    
    public static void sort(List<Integer> list) {
        int i, j;
        
        for(i = 1; i < list.size(); i++) {
            for(j = i; j > 0; j--) {
                if(list.get(j) < list.get(j - 1)) {                    
                    Util.swap(list, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
}
