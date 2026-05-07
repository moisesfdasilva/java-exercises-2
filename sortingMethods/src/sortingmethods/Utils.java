package sortingmethods;

import java.util.List;

/**
 * This class creates the useful tools
 * @author mf-silva
 */
public class Utils {
    
    public static void swap(List<Integer> list, int indexA, int indexB) {
        int aux = list.get(indexA);
        list.set(indexA, list.get(indexB));
        list.set(indexB, aux);
    }
    
}
