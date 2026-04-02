package sortingmethods;

import java.util.ArrayList;
import java.util.List;

/**
 * This class creates the MergeSort Method
 * @author mf-silva
 */
public class MergeSort {
    public static void sort(List<Integer> list) {
        if(list.size() > 1) {
            int midIndex = list.size() / 2;
            int lenTwo = list.size() - midIndex;
            
            List<Integer> listOne = new ArrayList<>();
            List<Integer> listTwo = new ArrayList<>();
            
            int i;
    
            for(i = 0; i < midIndex; i++) {
                listOne.add(list.get(i));
            }
    
            for(i = 0; i < lenTwo; i++) {
                listTwo.add(list.get(midIndex + i));
            }
    
            sort(listOne);
            sort(listTwo);
    
            merge(list, listOne, listTwo);
          }
    }
    
    public static void merge(List<Integer> list, List<Integer> listOne, 
            List<Integer> listTwo) {
        int topOne = 0, topTwo = 0;
        
        for(int i = 0; i < list.size(); i++) {
            if(topOne >= listOne.size()) {
              list.set(i, listTwo.get(topTwo));
              topTwo++;
            } else if(topTwo >= listTwo.size()) {
              list.set(i, listOne.get(topOne));
              topOne++;
            } else if(listOne.get(topOne) < listTwo.get(topTwo)) {
              list.set(i, listOne.get(topOne));
              topOne++;
            } else {
              list.set(i, listTwo.get(topTwo));
              topTwo++;
            }
        }
    }

}
