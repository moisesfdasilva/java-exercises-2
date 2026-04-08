package sortingmethods;

import java.util.List;

/**
 * This class creates the QuickSort Method.
 * @author mf-silva
 */
public class QuickSort {
    private static int partition(List<Integer> list, int low, int high) {
        int pivotValue = list.get(low); // median-of-three method (first, or mid, or last)
        int leftIndex = high;
        int aux;

        for(int i = high; i > low; i--) {
            if(pivotValue < list.get(i)) {
                aux = list.get(i);
                list.set(i, list.get(leftIndex));
                list.set(leftIndex, aux);
                
                leftIndex--;
            }
        }

        aux = list.get(low);
        list.set(low, list.get(leftIndex));
        list.set(leftIndex, aux);

        return leftIndex;
    }

    private static void quickSort(List<Integer> list, int low, int high) {
        if(low < high) {
            int pivotIndex = partition(list, low, high);

            quickSort(list, low, pivotIndex);
            quickSort(list, (pivotIndex + 1), high);
        }
    }
    
    public static void sort(List<Integer> list) {
        quickSort(list, 0, (list.size() - 1));
    }
    
}
