package bridgeLabz.Java.Practice;

import bridgeLabz.Java.Practice.LinkedList_UC5.Node;

public class LinkedList_UC5 { 
	
	class Node{
		int info;
		Node next;
		public Node(int info) {
			this.info = info;
		}
		public Node() {
			// TODO Auto-generated constructor stub
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
	   public void deleteNode() {
		 		if(this.head != null) {
		 		      Node temp = this.head;
		 		      this.head = this.head.next;
		 		      temp = null;  
		 		    }
	 }
	 //display the content of the list
	   void PrintList() {
	     Node temp = new Node();
	     temp = this.head;
	     if(temp != null) {
	       System.out.print("The list contains: ");
	       while(temp != null) {
	         System.out.print(temp.info + " ");
	         temp = temp.next;
	       }
	       System.out.println();
	     } else {
	       System.out.println("The list is empty.");
	     }
	   }   
	
  public static void main(String[] args) { 
    LinkedList_UC3 list = new LinkedList_UC3 ();
    System.out.println("List of Elements:");
    list.addNode(56);
    list.addNode(30);
    list.addNode(70);
    System.out.println("Before Deletion:");
    list.PrintList();
    list.deleteNode();
    System.out.println("After Deletion:");
    list.PrintList();
    
   }



}
