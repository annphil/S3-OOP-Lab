import java.util.Scanner;

class DLinkedList{
	
	class Node{
		int data;
		Node prev = null;
		Node next = null;	
	}
	
	Node head = null;
	Node tail = null;
	
	void insertNode(int data){
		Node node = new Node();
		node.data = data;
		
		//if empty
		if(head == null)
			head = tail = node;
		else {
			tail.next = node;
			node.prev = tail;
			tail = node;
		}
	}
	
	void deleteNode(int data){
		Node current = head;
		int flag = 0;
		
		if (current == null){
			System.out.println("Empty list");
			return;
		}	
		
		while(current != null){
			if(current.data == data){
				flag =1;
				if(current == head){
					head = current.next;
				}
				else if(current == tail){
					current.prev.next = null;
					tail = current.prev;
				}
				else{
					current.prev.next = current.next;
					current.next.prev = current.prev;
				}
			}
			current = current.next;
		}
		if (flag == 0)
			System.out.println(data + " not found");
	}
	
	void display(){
		Node current = head;
		if(current == null)
			System.out.print("Empty list");
		else{
			System.out.print("List : ");
			while(current!=null){
				System.out.print(current.data + " ");
				current = current.next;
			}
		}
		System.out.println();
	}
}

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		DLinkedList list = new DLinkedList();
		int flag = 1;
		
		while(flag == 1){
			System.out.print("\n1. Insert \n2. Delete \n3. Display \n4. Exit\nEnter your choice: ");
			int c = sc.nextInt();
			
			switch(c){
				case 1: System.out.print("Enter element: ");
						int item = sc.nextInt();
						list.insertNode(item);
						break;
				case 2: System.out.print("Enter element to be deleted: ");
						int d = sc.nextInt();
						list.deleteNode(d);
						break;
				case 3: list.display();
						break;
				case 4: flag = 0;
						break;
			}
		}
	}
}	
