package sortingmethods;

import java.util.List;

/**
 * This class creates the OddEvenSort (BrickSort) Method.
 * @author mf-silva
 */
public class OddEvenSort {
    
    public static void sort(List<Integer> list) {
        boolean sorted = false;
        
        while (!sorted) {
            sorted = true;

            for (int i = 1; i < list.size() - 1; i += 2) {
                if (list.get(i) > list.get(i + 1)) {
                    Util.swap(list, i, i + 1);
                    sorted = false;
                }
            }

            for (int i = 0; i < list.size() - 1; i += 2) {
                if (list.get(i) > list.get(i + 1)) {
                    Util.swap(list, i, i + 1);
                    sorted = false;
                }
            }
        }
    }
    
}
