package com.trees;

public class Main {

	public static void main(String[] args) {
		
		Tree tree=new Tree();
		
		tree.insert(15);
		tree.insert(11);
		tree.insert(34);
		tree.insert(32);
		tree.insert(15);
		tree.insert(67);
		tree.insert(18);
		tree.insert(78);
		
		System.out.print("In-Order Traversal is ----> ");
		tree.traversalInOrder();
		System.out.println(" ");
		
		System.out.print("Pre-Order Traversal is ----> ");
		tree.traversalPreOrder();
		System.out.println(" ");
		
		System.out.print("Post-Order Traversal is ----> ");
		tree.traversalPostOrder();
		System.out.println(" ");
		
		System.out.println("-----------------------------------");
		tree.delete(32);
		tree.delete(18);
		
		System.out.print("After the Deletion ----> ");
		tree.traversalInOrder();
		
		System.out.println(" ");
		
		System.out.println(tree.get(15));
		System.out.println(tree.get(100));
		
		
		System.out.println("minimum value int the tree is: "+tree.min());

		System.out.println("maximum value int the tree is: "+tree.max());
		
	}
	
	
	
}
