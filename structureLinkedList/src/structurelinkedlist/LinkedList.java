package structurelinkedlist;

/**
 * This class creates a stack
 * @author m-silva
 */
public class LinkedList {
    
    public LinkedList() {
        // Default constructor.
    }
    
    private class Node {
        public int number;
        public Node node;
    }
    
    private Node firstNode;
    private Node lastNode;
    
    public void add(int number) {
        Node newNode = new Node();
        newNode.number = number;
        
        if(this.firstNode == null) {
            this.lastNode = newNode;
            this.firstNode = newNode;
        } else {
            newNode.node = lastNode;
            this.lastNode = newNode;
        }
    }
    
    public int remove() {
        int response = 0;
        
        if(this.firstNode == null) {
            System.out.println("Stack overflow!");
        } else if (this.lastNode == null) {
            System.out.println("Stack overflow!");
        } else {
            response = this.lastNode.number;
            this.lastNode = this.lastNode.node;
        }
        
        return response;
    }
    
    public void showItens() {
        Node auxNode = lastNode;

        while(auxNode != null) {
            System.out.println(auxNode.number);
            auxNode = auxNode.node;
        }
    }

}
