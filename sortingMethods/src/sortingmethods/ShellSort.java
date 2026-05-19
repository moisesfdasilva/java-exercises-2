package sortingmethods;

import java.util.List;

/**
 * This class creates the ShellSort Method.
 * @author mf-silva
 */
public class ShellSort {
    
    public static void sort(List<Integer> list) {
        int i, j, k;
        
        for(i = list.size() / 2; i > 0; i = i / 2) {
            for(j = i; j < list.size(); j++) {
                for(k = j - i; k >= 0; k-= i) {
                    if(list.get(k + i) >= list.get(k)) {
                        break;
                    } else {
                        Util.swap(list, k + i, k);
                    }
                }
            }
        }
    }
    
}
