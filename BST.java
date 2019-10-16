import java.lang.*;
import java.util.*;

//Kyle Strougo

public class BST{

        protected Node root;
        protected Integer size;

        /**
         * Construct an empty bst.
         */
        public BST() {
            this.root = null;            
        }
        
        
        public void insert(Integer key) {
        	root = InsertBST(key,root); 
        }
        public void remove(Integer key) {
        	root = RemoveBST(key,root);
        }
        
        
        public boolean contains (Integer key) {
        	return ContainsBST(key, root);
        }
       

		public Node InsertBST(Integer key, Node node) {
        	if(node == null) {
        		return new Node(key);
        	}
        	if( key < node.key) {
        		node.left = InsertBST(key, node.left);	
        	}
        	else if(key>node.key) {
        		node.right = InsertBST(key,node.right);
        	}
        	return node;
        }

        public Node RemoveBST (Integer key, Node node) {

            if (node == null)
                return node;

            
            if (key < node.key){
                node.left = RemoveBST( key,node.left); }


            else if (key > node.key) {
                node.right = RemoveBST( key,node.right);  }

            else
            {

                if ((node.left == null) || (node.right == null))
                {
                    Node temp = null;
                    if (temp == node.left)
                        temp = node.right;
                    else
                        temp = node.left;

                    if (temp == null)
                    {
                        temp = node;
                        node = null;
                    }
                    else
                        node = temp;

                }
                else {

                    Integer min_temp = min(node.right);

                    node.key = min_temp;

                    node.right = RemoveBST(min_temp,node.right);
                }
              }
            return node;
            }
        	
        private boolean ContainsBST(Integer key, Node node) {
        	if(node == null) {
                return false;
            }
            if(key == node.key) {
                return true;
            }
            if(key < node.key) {
                return ContainsBST( key,node.left);
            } else {
                return ContainsBST( key,node.right);
            }
        }
        	
        
        Integer  min(Node root) 
        { 
            Integer minv = root.key; 
            while (root.left != null) 
            { 
                minv = root.left.key; 
                root = root.left; 
            } 
            return minv; 
        } 
        	
        public void inorder(){
            inorder(root);
        }
        
        private void inorder(Node node){
            if (node != null)
            {
                inorder(node.left);
                System.out.print(node.key + " ");
                inorder(node.right);
            }
        }
        	
        
        
        protected class Node {
            
            Node left;
            Node right;
         
            Integer key;

            /**
             * Construct an Node. At instantiation, each node has no
             * children and therefore a height of 0.
             * @param element the element that this node contains
             */
            public Node(Integer inte) {
                this.left = null;
                this.right = null;
                this.key = inte;
            }
        }


}

