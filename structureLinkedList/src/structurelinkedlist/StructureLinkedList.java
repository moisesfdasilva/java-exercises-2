package structurelinkedlist;

/**
 * This class runs this project
 * @author mf-silva
 */
public class StructureLinkedList {

    /**
     * @param args the command line arguments
     * This method runs a stack
     */
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        System.out.println("-----------------ITENS-----------------");
        list.showItens();
        System.out.println("---------------------------------------");
        
        list.remove();
        list.remove();
        list.remove();
        list.remove();
        
        System.out.println("-----------------ITENS-----------------");
        list.showItens();
        System.out.println("---------------------------------------");
        
        list.remove();
        
    }
    
}
