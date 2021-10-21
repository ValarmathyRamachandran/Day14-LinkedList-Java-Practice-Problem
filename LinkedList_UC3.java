package bridgeLabz.Java.Practice;

import bridgeLabz.Java.Practice.LinkedList_UC3.Node;

public class LinkedList_UC3 { 
	
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
		Node objn = new Node(info);
		if (head == null) {
			head = objn;
			tail = objn;
		}
		else {
			tail.next = objn;
			tail = objn;
		}
		
		System.out.println(objn.info);
		
	}
	

  public static void main(String[] args) { 
    LinkedList_UC3 list = new LinkedList_UC3 ();
    list.addNode(56);
    list.addNode(30);
    list.addNode(70);
    
   }



}
