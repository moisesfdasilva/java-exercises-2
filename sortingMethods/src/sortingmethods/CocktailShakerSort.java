package sortingmethods;

import java.util.List;

/**
 * This class creates the CocktailShakerSort (or ShakerSort) Method
 * @author mf-silva
 */
public class CocktailShakerSort {
    
    public static void sort(List<Integer> list) {
        boolean swapped = true;
        int start = 0;
        int end = list.size() - 1;

        while (swapped) {
            swapped = false;

            for (int i = start; i < end; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    Util.swap(list, i, i + 1);
                    swapped = true;
                }
            }

            if (!swapped)
                break;

            swapped = false;

            end--;

            for (int i = end - 1; i >= start; i--) {
                if (list.get(i) > list.get(i + 1)) {
                    Util.swap(list, i, i + 1);
                    swapped = true;
                }
            }

            start++;
        }
    }
    
}
