public class RunBST {

	public static void main (String[] args){

        BST test = new BST();

        test.insert(2);

        test.insert(15);
        
        System.out.println("Inorder: ");
        
        test.inorder();
        

        }

}
