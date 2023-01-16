package com.trees;

public class TreeNode {
	
	private int data;
	private TreeNode leftChild;
	private TreeNode rightChild;
	
	public TreeNode(int data) {
		this.data=data;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public TreeNode getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}
	public TreeNode getRightChild() {
		return rightChild;
	}
	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}
	
	
	
	
	/*
	@Override
	public String toString() {
		return "TreeNode [data=" + data + ", leftChild=" + leftChild + ", rightChild=" + rightChild + "]";
	}
	*/
	
	@Override
	public String toString() {
		return "data=" + data ;
	}
	
	
	
	/* our created  methods */

	public void insert(int value) {
		if(value==data)
			return;
		if(value<data) {
			if(leftChild==null) {
				leftChild=new TreeNode(value);
			}
			else {
				leftChild.insert(value);
			}
		}
		else {
			if(rightChild==null) {
				rightChild=new TreeNode(value);
			}
			else {
				rightChild.insert(value);
			}
		}
	}
	
	
	public void traversalInOreder() {
		if(leftChild!=null)
			leftChild.traversalInOreder();
		System.out.print(+ data + ",");
		if(rightChild!=null)
			rightChild.traversalInOreder();
			
	}
	
	public void traversalPreOrder() {
		
		System.out.print(+ data + ",");
		if(leftChild!=null)
			leftChild.traversalPreOrder();
		
		if(rightChild!=null)
			rightChild.traversalPreOrder();
			
	}
	
	
	public void traversalPostOrder() {
		
		if(leftChild!=null)
			leftChild.traversalPostOrder();
		
		if(rightChild!=null)
			rightChild.traversalPostOrder();
		System.out.print(+ data + ",");
			
	}
	
	
	public TreeNode get(int value) {
		if(value==data)
			return this;
		if(value<data) {
			if(leftChild!=null)
				return leftChild.get(value);
		}
		
		else {
			if(rightChild!=null) {
				return rightChild.get(value);
			}
		}
		return null;
	}
	
	
	public int min() {
		if(leftChild==null)
			return data;
		else
			return leftChild.min();
	}

	
	public int max() {
		if(rightChild==null)
			return data;
		else
			return rightChild.max();
	}
	
	
	

}
