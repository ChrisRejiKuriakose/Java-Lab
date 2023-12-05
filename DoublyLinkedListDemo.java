import java.util.LinkedList;
import java.util.Scanner;
class DoublyLInkedList<T>{
	private LinkedList<T>list = new LinkedList<>();
	public void insertAtEnd(T element) {
		list.addLast(element);
	}
	public void insertAtFront(T element) {
		list.addFirst(element);
	}
	public void insertAtAnyPosition(int index, T element) {
		list.add(index,element);
	}
	public void removeAtAnyPosition(int index) {
		list.remove(index);
	}
	public void display() {
		for(T element : list) {
			System.out.println(element +" ");
		}
		System.out.println( );
	}
}


public class DoublyLinkedListDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DoublyLInkedList<Integer>doublyLinkedList = new DoublyLInkedList<>();
		boolean condition = true;
		while(condition) {
			System.out.println("Enter choice\n"
			+"1)Insert at front\n"
			+"2)Insert at end\n"
			+"3)Insert at any position\n"
			+"4)Delete from any position\n"
			+"5)Display\n"
			+"6)Exit\n");
		int choice = sc.nextInt();
		int element,position;
		switch(choice) {
		case 1:
			System.out.println("enter element:");
			element = sc.nextInt();
			doublyLinkedList.insertAtFront(element);
			break;
		
		case 2:
			System.out.println("enter element:");
			element = sc.nextInt();
			doublyLinkedList.insertAtEnd(element);
			break;	
		
		case 3:
			System.out.println("enter element:");
			 element = sc.nextInt();
			System.out.println("enter position:");
			 position = sc.nextInt();
			doublyLinkedList.insertAtAnyPosition(position,element);
			break;
		case 4:
			System.out.println("enter position:");
			position = sc.nextInt();
			doublyLinkedList.removeAtAnyPosition(position);
			break;
			
		case 5:
			System.out.println("elements are :");
			doublyLinkedList.display();
			break;
		
		case 6:
			condition = false;
			break;
		default :
			System.out.println("wrong choice");
			
			 
			
		   }
		}
    }

 }