package com.list;

public class EmpDoublyNode {
	
	private  Employee employee;
	private EmpDoublyNode next;
	private EmpDoublyNode previous;
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public EmpDoublyNode getNext() {
		return next;
	}
	public void setNext(EmpDoublyNode next) {
		this.next = next;
	}
	public EmpDoublyNode getPrevious() {
		return previous;
	}
	public void setPrevious(EmpDoublyNode previous) {
		this.previous = previous;
	}
	
	
	public EmpDoublyNode(Employee employee) {
		super();
		this.employee = employee;
	}
	
	public EmpDoublyNode() {
		
	}
	
	
	
	

}
