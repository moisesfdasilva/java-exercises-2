package sortingmethods;

import java.util.List;

/**
 * This class creates the ShellSort Method.
 * @author mf-silva
 */
public class ShellSort {
    private static void shellSort(List<Integer> list, int k, int h) {
        int i, j, aux;
        
        while(h > 0) {
            for(i = 0; i < list.size() - h; i++) {
                if(list.get(i) > list.get(i + h)) {
                    aux = list.get(i + h);
                    list.set((i + h), list.get(i));
                    list.set(i, aux);
                    j = i - h;
                    
                    while(j >= 0) {
                        if(aux < list.get(j)) {
                            list.set((j + k), list.get(j));
                            list.set(j, aux);
                        } else {
                            break;
                        }
                        j = j - h;
                    }
                }
                h = (h - 1) / 3;
            }
        }
    }
    
    public static void sort(List<Integer> list) {
        int k = (int) ((Math.log(list.size() + 1) / Math.log(3)) + 0.5);
        
        int h = (int) (Math.pow(3, k) - 1) / 2;
        
        shellSort(list, k, h);
    }
}
