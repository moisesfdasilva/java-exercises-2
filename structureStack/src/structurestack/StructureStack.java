package structurestack;

/**
 * This class runs this project
 * @author mf-silva
 */
public class StructureStack {

    /**
     * @param args the command line arguments
     * This method runs a stack
     */
    public static void main(String[] args) {
        Stack stack = new Stack();
        
        for(int i = 10; i > 0; i--) {
            stack.push(i);
        }
        
        System.out.println("-----------------ITENS-----------------");
        stack.showItens();
        System.out.println("---------------------------------------");
        
        for(int i = 15; i > 0; i--) {
            int valueRemoved = stack.pop();
            System.out.println(valueRemoved);
        }

    }
    
}
