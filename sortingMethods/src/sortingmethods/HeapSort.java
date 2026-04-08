package sortingmethods;

import java.util.List;

/**
 * This class creates the HeapSort Method
 * @author mf-silva
 */
public class HeapSort {
    private static void heapfy(List<Integer> list, int i, int len) {
        int max = i, aux;
        int childA = 2 * i + 1;
        int childB = 2 * i + 2;
        
        if((childA < len) && (list.get(childA) > list.get(i))) {
            max = childA;
        }
        
        if((childB < len) && (list.get(childB) > list.get(max))) {
            max = childB;
        }
        
        if(max != i) {
            aux = list.get(i);
            list.set(i, list.get(max));
            list.set(max, aux);
            
            heapfy(list, max, len);
        }
    }

    private static void buildMaxHeap(List<Integer> list) {
        for(int i = ((list.size() - 1) / 2); i >= 0; i--) {
            heapfy(list, i, list.size());
        }
    }

    public static void sort(List<Integer> list) {
        buildMaxHeap(list);
        
        int i, aux;
        
        for(i = (list.size() - 1); i > 0; i--) {
            aux = list.get(i);
            list.set(i, list.get(0));
            list.set(0, aux);
            
            heapfy(list, 0, i);
        }
    }
}
