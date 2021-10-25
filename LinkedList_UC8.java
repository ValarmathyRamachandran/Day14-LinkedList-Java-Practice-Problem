package bridgeLabz.Java.Practice;

public class LinkedList_UC8 { 
	
	public class Node{
		int info;
		Node next;
		public int data;
		public Node nextNode;
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
		
	 public void insertNth(int info, int position) {
	        //create new node.
	        Node node = new Node();
	        node.info = info;
	       Node temp=this.head;
	       
	       if(position==1)
	       {
	    	   this.head=node;
	    	   node.next=temp;
	       }
	       else
	       {
	       int ctr=1;
	       while(ctr<position-1) {
		        temp = temp.next;
		        ctr++;
	       }
	       
	       Node nextNode=new Node();
	       nextNode=temp.next;
	       temp.next=node;
	       node.next=nextNode;
		     
	       }
    }

	 void deleteLast() {
		  if(this.head != null) {
		    
		    //1. if head in not null and next of head
		    //   is null, release the head
		    if(this.head.next == null) {
		      this.head = null;
		    } else {
		      
		      //2. Else, traverse to the second last 
		      //   element of the list
		      Node temp = new Node();
		      temp = this.head;
		      while(temp.next.next != null)
		        temp = temp.next;
		      
		      //3. Change the next of the second 
		      //   last node to null and delete the
		      //   last node
		      Node lastNode = temp.next;
		      temp.next = null; 
		      lastNode = null;
		    }
		  }
		}
		 	
	//searchNode() will search for a given node in the list  
	    public Node searchNode(int info) {  
	        Node current = head;  
	        int i = 1;  
	        boolean flag = false;  
	        //Checks whether list is empty  
	        if(head == null) {  
	            System.out.println("List is empty");  
	        }  
	        else {  
	            while(current != null) {  
	                 //Compares node to be found with each node present in the list  
	                if(current.info == info) {  
	                    flag = true;  
	                    break;  
	                }  
	                i++;  
	                current = current.next;  
	            }  
	        }  
	        if(flag)  
	             System.out.println("Element is present in the list at the position : " + i);  
	        else  
	             System.out.println("Element is not present in the list");  
	        
	        return current;
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
    LinkedList_UC8 list = new LinkedList_UC8 ();
    System.out.println("List of Elements:");
    list.addNode(56);
    list.addNode(30);
    list.addNode(70);
    System.out.println("Before Insertion:");
    list.PrintList();
    System.out.println("After Insertion:");
    list.insertNth(40,3);
    list.PrintList(); 
   }

	}


