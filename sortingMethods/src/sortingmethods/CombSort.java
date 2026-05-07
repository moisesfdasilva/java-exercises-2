package sortingmethods;

import java.util.List;

/**
 * This class creates the CombSort Method
 * @author mf-silva
 */
public class CombSort {
    
    private static int nextGap(int gap) {
        gap = (gap * 10) / 13;
        
        if (gap < 1) gap = 1;
        
        return gap;
    }
    
    public static void sort(List<Integer> list) {
        int changed = 0;
        
        int gap = list.size();
        
        while (gap != 1 || changed == 1) {
            gap = nextGap(gap);
            changed = 0;
            
            for (int i = 0; i < list.size() - gap; i ++) {
                if(list.get(i) > list.get(i + gap)) {
                    Utils.swap(list, i, i + gap);
                    changed = 1;
                }
            }
        }
    }
}
