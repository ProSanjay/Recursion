package dsa;

public class LinkedList {
Node head;
public void add(int data) {
	Node toAdd=new Node(data);
	if(head==null) {
		head=toAdd;
		return;
	}
 Node temp=head;
 while(temp.next!=null) {
	 temp=temp.next;
 }
 temp.next=toAdd;
}
public void print() {
	Node temp=head;
	while(temp!=null) {
		System.out.println(temp.data);
		temp=temp.next;
	}
}
}
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}