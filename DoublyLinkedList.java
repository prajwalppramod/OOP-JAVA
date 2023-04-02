import java.util.*;
class Node {
	Node prev, next;
	int data;
	public Node(int data) {
		this.data = data;
		this.prev = null;
		this.next = null;
	}
	public Node(int data, Node prev, Node next) {
		this.data = data;
		this.prev = prev;
		this.next = next;
	}
}
class DoublyLinkedList {
	static Scanner sc = new Scanner(System.in);
	static Node f = null, r = null;
	public static void main(String[] args) {
		int ch = 0;
		while(ch != 6) {
			ch = getChoice();
			switch(ch) {
				case 1: insertFront(); break;
				case 2: insertRear(); break;
				case 3: deleteFront(); break;
				case 4: deleteRear(); break;
				case 5: display(); break;
				case 6: break;
				default: System.out.println("Enter valid choice");
			}
		}
	}
	public static int getChoice() {
		System.out.println("\n1.Add to front\n2.Add to rear\n3.Remove from front\n4.Remove from rear \n5.Display the DLL\n6.Exit");
		return(sc.nextInt());
	}
	public static void insertFront() {
		System.out.println("Enter number: ");
		if(f == null) {
			f = new Node(sc.nextInt());
			r = f;
			return;
		}
		f.prev = new Node(sc.nextInt(), null, f);
		f = f.prev;
	}
	public static void insertRear() {
		System.out.println("Enter number: ");
		if(r == null) {
			f = new Node(sc.nextInt());
			r = f;
			return;
		}
		r.next = new Node(sc.nextInt(), r, null);
		r = r.next;
	}
	public static void deleteFront() {
		if(f == null) {
			System.out.println("List Underflow");
			return;
		}
		System.out.println("Deleted " + f.data);
		f = f.next;
		if(f == null) {
			r = null;
			return;
		}
		f.prev = null;
	}
	public static void deleteRear() {
		if(r == null) {
			System.out.println("List Underflow");
			return;
		}
		System.out.println("Deleted " + r.data );
		r = r.prev;
		if(r == null) {
			f = null;
			return;
		}
		r.next = null;
	}
	public static void display() {
		if(f == null) {
			System.out.println("List Underflow");
			return;
		}
		Node p = f;
		while(p != null) {
			System.out.print(p.data+" ");
			p = p.next;
		}
	}
}
/*OUTPUT
1.Add to front
2.Add to rear
3.Remove from front
4.Remove from rear 
5.Display the DLL
6.Exit
1
Enter number: 
50
1.Add to front
2.Add to rear
3.Remove from front
4.Remove from rear 
5.Display the DLL
6.Exit
1
Enter number: 
60
1.Add to front
2.Add to rear
3.Remove from front
4.Remove from rear 
5.Display the DLL
6.Exit
1
Enter number: 
70
1.Add to front
2.Add to rear
3.Remove from front
4.Remove from rear 
5.Display the DLL
6.Exit
5
70 60 50 
1.Add to front
2.Add to rear
3.Remove from front
4.Remove from rear 
5.Display the DLL
6.Exit
3
Deleted 70
1.Add to front
2.Add to rear
3.Remove from front
4.Remove from rear 
5.Display the DLL
6.Exit
4
Deleted 50
1.Add to front
2.Add to rear
3.Remove from front
4.Remove from rear 
5.Display the DLL
6.Exit
5
60 
1.Add to front
2.Add to rear
3.Remove from front
4.Remove from rear 
5.Display the DLL
6.Exit
*/

