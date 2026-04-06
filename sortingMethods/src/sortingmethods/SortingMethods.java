package sortingmethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This class runs this project
 * @author mf-silva
 */
public class SortingMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        runBoobleSort();
        runSelectionSort();
        runInsertionSort();
        runMergeSort();
        runHeapSort();
    }
    
    private static void runBoobleSort() {
        List<Integer> list = new ArrayList<>(
                Arrays.asList(8, 5, 6, 9, 10, 1, 4, 3, 7, 2));
        
        System.out.println("************************************");
        System.out.println("BoobleSort");
        
        System.out.println("------------------------------------");
        System.out.println("Unordered list");

        for(Integer num : list) {
            System.out.print(num + " ");
        }
        
        System.out.println();
        
        BoobleSort.sort(list);
        
        System.out.println("------------------------------------");
        System.out.println("Ordered list");
        
        for(Integer num : list) {
            System.out.print(num + " ");
        }
        
        System.out.println();
        System.out.println("************************************");
    }
    
    private static void runSelectionSort() {
        List<Integer> list = new ArrayList<>(
                Arrays.asList(8, 5, 6, 9, 10, 1, 4, 3, 7, 2));
        
        System.out.println("************************************");
        System.out.println("SelectionSort");
        
        System.out.println("------------------------------------");
        System.out.println("Unordered list");

        for(Integer num : list) {
            System.out.print(num + " ");
        }
        
        System.out.println();
        
        SelectionSort.sort(list);
        
        System.out.println("------------------------------------");
        System.out.println("Ordered list");
        
        for(Integer num : list) {
            System.out.print(num + " ");
        }
        
        System.out.println();
        System.out.println("************************************");
    }
    
    private static void runInsertionSort() {
        List<Integer> list = new ArrayList<>(
                Arrays.asList(8, 5, 6, 9, 10, 1, 4, 3, 7, 2));
        
        System.out.println("************************************");
        System.out.println("InsertionSort");
        
        System.out.println("------------------------------------");
        System.out.println("Unordered list");

        for(Integer num : list) {
            System.out.print(num + " ");
        }
        
        System.out.println();
        
        InsertionSort.sort(list);
        
        System.out.println("------------------------------------");
        System.out.println("Ordered list");
        
        for(Integer num : list) {
            System.out.print(num + " ");
        }
        
        System.out.println();
        System.out.println("************************************");
    }
    
    private static void runMergeSort() {
        List<Integer> list = new ArrayList<>(
                Arrays.asList(8, 5, 6, 9, 10, 1, 4, 3, 7, 2));
        
        System.out.println("************************************");
        System.out.println("MergeSort");
        
        System.out.println("------------------------------------");
        System.out.println("Unordered list");

        for(Integer num : list) {
            System.out.print(num + " ");
        }
        
        System.out.println();
        
        MergeSort.sort(list);
        
        System.out.println("------------------------------------");
        System.out.println("Ordered list");
        
        for(Integer num : list) {
            System.out.print(num + " ");
        }
        
        System.out.println();
        System.out.println("************************************");
    }
    
    private static void runHeapSort() {
        List<Integer> list = new ArrayList<>(
                Arrays.asList(8, 5, 6, 9, 10, 1, 4, 3, 7, 2));
        
        System.out.println("************************************");
        System.out.println("HeapSort");
        
        System.out.println("------------------------------------");
        System.out.println("Unordered list");

        for(Integer num : list) {
            System.out.print(num + " ");
        }
        
        System.out.println();
        
        HeapSort.sort(list);
        
        System.out.println("------------------------------------");
        System.out.println("Ordered list");
        
        for(Integer num : list) {
            System.out.print(num + " ");
        }
        
        System.out.println();
        System.out.println("************************************");
    }
}
