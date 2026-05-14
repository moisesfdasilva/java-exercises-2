package sortingmethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * This class runs this project
 * @author mf-silva
 */
public class SortingMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List listA = createList();
        printList(listA, "BoobleSort", "Unordered list");
        BoobleSort.sort(listA);
        printList(listA, "BoobleSort", "Ordered list");
        
        List listB = createList();
        printList(listB, "SelectionSort", "Unordered list");
        SelectionSort.sort(listB);
        printList(listB, "SelectionSort", "Ordered list");
        
        List listC = createList();
        printList(listC, "InsertionSort", "Unordered list");
        InsertionSort.sort(listC);
        printList(listC, "InsertionSort", "Ordered list");
        
        List listD = createList();
        printList(listD, "MergeSort", "Unordered list");
        MergeSort.sort(listD);
        printList(listD, "MergeSort", "Ordered list");
        
        List listE = createList();
        printList(listE, "HeapSort", "Unordered list");
        HeapSort.sort(listE);
        printList(listE, "HeapSort", "Ordered list");
        
        List listF = createList();
        printList(listF, "QuickSort", "Unordered list");
        QuickSort.sort(listF);
        printList(listF, "QuickSort", "Ordered list");
        
        List listG = createList();
        printList(listG, "CountingSort", "Unordered list");
        CountingSort.sort(listG);
        printList(listG, "CountingSort", "Ordered list");
        
        List listH = createList();
        printList(listH, "ShellSort", "Unordered list");
        ShellSort.sort(listH);
        printList(listH, "ShellSort", "Ordered list");

        List listI = createList();
        printList(listI, "RadixSort", "Unordered list");
        RadixSort.sort(listI);
        printList(listI, "RadixSort", "Ordered list");
        
        List listJ = createList();
        printList(listJ, "BucketSort", "Unordered list");
        BucketSort.sort(listJ);
        printList(listJ, "BucketSort", "Ordered list");
        
        List listK = createList();
        printList(listK, "CombSort", "Unordered list");
        CombSort.sort(listK);
        printList(listK, "CombSort", "Ordered list");
        
        List listL = createList();
        printList(listL, "TimSort", "Unordered list");
        TimSort.sort(listL);
        printList(listL, "TimSort", "Ordered list");
    }
    
    private static List createList() {
        List<Integer> list = new ArrayList<>();
        
        Random gerador = new Random();
        int i, num;
        
        for(i = 0; i < 20; i++) {
            num = gerador.nextInt(100);
            list.add(num);
        }
        
        return list;
    }
    
    private static void printList(List<Integer> list, String method,
            String type) {
        System.out.println("************************************************" + 
                "************");
        System.out.println(method + " - " + type);

        for(Integer num : list) {
            System.out.print(num + " ");
        }

        System.out.println();
    }
    
}
