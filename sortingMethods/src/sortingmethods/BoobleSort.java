package sortingmethods;

import java.util.List;

/**
 * This class creates the BoobleSort Method
 * @author mf-silva
 */
public class BoobleSort {

    public static void sort(List<Integer> list) {
        int i, j;
        
        for(i = 0; i < list.size(); i++) {
            for(j = 1; j < (list.size() - i); j++) {
                if(list.get(j - 1) > list.get(j)) {
                    Util.swap(list, j - 1, j);
                }
            }
        }
    }
}
