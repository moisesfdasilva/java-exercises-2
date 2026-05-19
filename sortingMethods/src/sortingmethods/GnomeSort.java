package sortingmethods;

import java.util.List;

/**
 * This class creates the GnomeSort Method.
 * @author mf-silva
 */
public class GnomeSort {
    
    public static void sort(List<Integer> list) {
        int i = 0;

        while (i < list.size()) {
            if (i == 0) {
                i++;
            }
            if (list.get(i) >= list.get(i - 1)) {
                i++;
            } else {
                Util.swap(list, i, i - 1);
                i--;
            }
        }
    }
    
}
