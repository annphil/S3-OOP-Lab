import java.util.Scanner;

class SinglyLinkedList {

	class Node{
		int data;
		Node link = null;
	}
	
	Node head=null,tail=null;
		
	void insertEnd(int item){
		Node node=new Node();
		node.data=item;
		
		//If 1st element in list
		if(head==null)
			head = node;
		else
			tail.link = node;
		tail = node;
	}
		
	void display(){
		Node temp=head;
		if(head == null)
			System.out.println("Empty List!");
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.link;
			}
	}

	void delete(int item){
		if(head == null)
			System.out.print("Empty List\n");
		else if(head.data == item)				// If 1st element is getting deleted
			head = head.link;
		else{
			Node trail = head;
			Node temp = head;
			while(trail.link != null){
				if(temp.data == item){
					if(temp == tail){
        				tail = trail;
        				tail.link = null;
        				break;
        			}
        			else {
        				trail.link = temp.link;
        				break;
        			}
        		}	
        		trail = temp;
        		temp = temp.link;
        	}
        }
	}
}
        



class Main{
    public static void main(String args[]){
        SinglyLinkedList obj=new SinglyLinkedList();
        int item;
        Scanner sc=new Scanner(System.in);
        int flag=1;
        while(flag==1){   
            int ch;
            System.out.print("\nEnter your choice\n1. Insert Node\n2. Delete Node\n3. Display\n4. Exit Program\n");
            ch=sc.nextInt();
            switch(ch){
                case 1:System.out.println("\nEnter item to be inserted:");
                       item=sc.nextInt();
                       obj.insertEnd(item);
                       System.out.println();
                       break;

                case 2:System.out.println("\nEnter item to be deleted:");
                       item=sc.nextInt();
                       obj.delete(item);
                       System.out.println();
                       break;

                case 3: System.out.println("\nLinked List: ");
                	 	obj.display();
                	 	System.out.println();
                    	break;
                      
                case 4:flag=0;
                       break;
            }
        }
    }
}
