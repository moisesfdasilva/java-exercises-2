package sortingmethods;

import java.util.List;

/**
 * This class creates the CombSort Method
 * @author mf-silva
 */
public class CombSort {
    
    private static int nextGap(int gap) {
        gap = (gap * 10) / 13;
        
        if (gap < 1) return 1;
        
        return gap;
    }
    
    public static void sort(List<Integer> list) {
        int trocado = 0, aux;
        
        int gap = list.size();
        
        while (gap != 1 || trocado == 1) {
            gap = nextGap(gap);
            trocado = 0;
            for (int i = 0; i < list.size() - gap; i ++) {
                if(list.get(i) > list.get(i + gap)) {
                    aux = list.get(i);
                    list.set(i, list.get(i + gap));
                    list.set(i + gap, aux);
                    trocado = 1;
                }
            }
        }
    }
}
