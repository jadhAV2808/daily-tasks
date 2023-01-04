package com.list;

public class EmployeeDoublyLinkedList {
	
	private EmpDoublyNode head;
	private EmpDoublyNode tail;
	private int size;
	
	public void addToFront(Employee employee) {
		
		EmpDoublyNode node=new EmpDoublyNode(employee);
		node.setNext(head);
		
		if(head==null) {
			tail=node;
		}
		else
		{
			head.setPrevious(node);
		}
		head=node;
		size++;
	}
	
	public EmpDoublyNode removeFromFront() {
		if(isEmpty())
			return null;
		EmpDoublyNode removedNode=head;
		head=head.getNext();
		size--;
		removedNode.setNext(null);
		return  removedNode;
		
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void printList() {
		EmpDoublyNode current=head;
		System.out.print("HEAD -> ");
		
		while(current!=null) {
			System.out.print(current);
			System.out.print(" <=> ");
			current=current.getNext();
		}
		System.out.println("null");
	}


}
