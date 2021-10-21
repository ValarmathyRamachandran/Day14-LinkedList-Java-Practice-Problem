package bridgeLabz.Java.Practice;
import java.util.*;
import java.util.LinkedList;

public class LinkedListUC2 { 
	
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
    LinkedListUC2 list = new LinkedListUC2 ();
    list.addNode(70);
    list.addNode(30);
    list.addNode(56);
    
   }



}



	
