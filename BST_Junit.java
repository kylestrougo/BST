import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;

import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class BSTunit {

	@Test
	void insert() {
		
		 BST test = new BST();

	        test.insert(3);
	        test.insert(31);
	        
	        test.insert(1);
	        test.insert(16);
	        
	        test.insert(41);
	        test.insert(23);
	        test.insert(4);
	        
	        
	        test.insert(29);
	        
	        
	        
	        
	        System.out.println("Inorder: ");
	        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
			System.setOut(new PrintStream(outContent));
			test.inorder();
			String expectedOutput = "1 3 4 16 23 29 31 41 ";
			assertEquals(expectedOutput, outContent.toString());
	        
	        
	}
	@Test
	void remove() {
		
		 BST test = new BST();

	        test.insert(3);
	        test.insert(31);
	        
	        test.insert(1);
	        test.insert(16);
	        test.insert(41);
	        test.insert(23);
	        
	        test.insert(4);
	        test.insert(29);
	        
	        test.remove(16);
	        
	        System.out.println("Inorder: ");
	        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
			System.setOut(new PrintStream(outContent));
			
			test.inorder();
			String expectedOutput = "1 3 4 23 29 31 41 ";
			assertEquals(expectedOutput, outContent.toString());
		

	}
	
	
	@Test
	void contains() {
		
		 BST test = new BST();

	        test.insert(3);
	        test.insert(31);
	        
	        
	        test.insert(1);
	        test.insert(16);
	        test.insert(41);
	        test.insert(23);
	        
	        test.insert(4);
	        test.insert(29);
	       
	       
	        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
			System.setOut(new PrintStream(outContent));
			System.out.print(test.contains(16));   
			String expectedOutput = "true";
			assertEquals(expectedOutput, outContent.toString());
		

	}
	
}
