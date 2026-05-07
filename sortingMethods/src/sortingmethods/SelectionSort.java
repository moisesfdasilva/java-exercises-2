package sortingmethods;

import java.util.List;

/**
 * This class creates the SelectionSort Method
 * @author mf-silva
 */
public class SelectionSort {
    
    public static void sort(List<Integer> list) {
        int i, j, minValue, minIndex = 0;
        
        for(i = 0; i < list.size(); i++) {
            minValue = list.get(i);
            
            for(j = (1 + i); j < list.size(); j++) {
                if(minValue > list.get(j)) {
                    minValue = list.get(j);
                    minIndex = j;
                }
            }
            
            if(minValue != list.get(i)) {
                Utils.swap(list, i, minIndex);
            }
        }
    }

}
