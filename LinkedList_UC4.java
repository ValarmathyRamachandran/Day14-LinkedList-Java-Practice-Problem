package bridgeLabz.Java.Practice;

import bridgeLabz.Java.Practice.LinkedList_UC4.Node;

public class LinkedList_UC4 { 
	
	class Node{
		int info;
		Node next;
		public Node(int info) {
			this.info = info;
		}
	}
	public Node head = null;
	public Node tail = null;

	public void addNode(int info) {
		Node objnode = new Node(info);
		if (head == null) {
			head = objnode;
			tail = objnode;
		}
		else {
			tail.next = objnode;
			tail = objnode;
		}
		System.out.println(objnode.info);
	}
		
	 public void insertNode(int newElement, int position) {     
		    Node newNode = new Node(newElement); 
		    newNode.info = newElement;
		    newNode.next = null;
		    System.out.println(newNode.info);
	 }
	

  public static void main(String[] args) { 
    LinkedList_UC3 list = new LinkedList_UC3 ();
    list.addNode(56);
    list.insertNode(30, 2);
    list.addNode(70);
    
   }



}
