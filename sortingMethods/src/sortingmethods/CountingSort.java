package sortingmethods;

import java.util.Arrays;
import java.util.List;

/**
 * This class creates the CountingSort Method.
 * @author mf-silva
 */
public class CountingSort {
    private static List<Integer> getCountList(List<Integer> list) {
        int max = list.get(0);
        int i, j, count;
        
        for(i = 1; i < list.size(); i++) {
            if(max < list.get(i)) {
                max = list.get(i);
            }
        }
        
        List<Integer> countList = Arrays.asList(new Integer[max + 1]);
        
        for(i = 0; i <= max; i++) {
            count = 0;
            
            for(j = 0; j < list.size(); j++) {
                if(i == list.get(j)) {
                    count++;
                }
            }
            
            countList.set(i, count);
        }
        
        return countList;
    }
    
    public static void sort(List<Integer> list) {
        int i = 0, j = 0;
        
        List<Integer> countList = getCountList(list);
        
        while(i < countList.size()) {
            if(countList.get(i) < 1) {
                i++;
            } else {
                list.set(j, i);
                countList.set(i, countList.get(i) - 1);
                j++;
            }
        }
    }
    
}
