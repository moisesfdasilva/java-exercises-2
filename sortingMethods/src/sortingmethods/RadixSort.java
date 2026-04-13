package sortingmethods;

import java.util.Arrays;
import java.util.List;

/**
 * This class creates the RadixSort Method.
 * @author mf-silva
 */
public class RadixSort {
    private static void countsort(List<Integer> list, int pos) {
        int i, aux;
        
        List<Integer> auxList = Arrays.asList(new Integer[list.size() + 1]);
        
        int max = (list.get(0) / pos) % 10;
        
        for (i = 1; i < list.size(); i++) {
            if (((list.get(i) / pos) % 10) > max){
                max = list.get(i);
            }
        }
        
        List<Integer> countList = Arrays.asList(new Integer[list.size() + 1]);
        
        for (i = 0; i < max; ++i) {
            countList.set(i, 0);
        }
        for (i = 0; i < list.size(); i++){
            aux = (list.get(i) / pos) % 10;
            countList.set(aux, aux + 1);
        }
        for (i = 1; i < 10; i++) {
            countList.set(i, countList.get(i) + countList.get(i - 1));
        }
        for (i = list.size() - 1; i >= 0; i--) {
            aux = (list.get(i) / pos) % 10;
            auxList.set(auxList.get(aux) - 1, list.get(i));
            countList.set(aux, countList.get(aux) - 1);
        }
        for (i = 0; i < list.size(); i++) {
            list.set(i, auxList.get(i));
        }
    }
    
    public static void sort(List<Integer> list) {
        int i;
        int max = list.get(0);
        
        for (i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        
        for (i = 1; max / i > 0; i *= 10) {
            countsort(list, i);
        }
    }

}
