public class DoublyLinkedList
{   public class Node
    {   int data;
        Node prev;
        Node next;
        public Node(int data, Node prev, Node next)
        {   this.data=data;
            this.prev=prev;
            this.next=next;
        }
    }
    Node head=null;
    Node tail=null;

    public void Addfront(int num)
    {
        Node temp = new Node(num, head, null);
        if(head!=null)
        {
            head.prev= temp;
        }
        head= temp;
        if(tail==null)
        {
            tail=temp;
        }
        System.out.println("New node added: "+num);
    }
    public void Addback(int num)
    {
        Node temp= new Node(val,null,tail);
        if(tail!=null)
        {
            tail.next=temp;
        }
        tail=temp;
        if(head==null)
        {
            head=temp;
        }
        System.out.println("New node added: "+num); 
    }

    public void iterateForward()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data + " ");
            temp=temp.next;
        }
    }

    public void iterateBackward()
    {
        Node temp=tail;
        while(temp!=null)
        {
            System.out.println(temp.data + " ");
            temp=temp.prev;
        }
    }

    public int removeNodeFront()
    {
        int temp=head.data;
        head=head.next;
        head.prev=null;
        System.out.println("deleted: " + temp);
        return temp;
    }

    public int removeNodeBack()
    {
        int temp = tail.data;
        tail = tail.prev;
        tail.next = null;
        System.out.println("deleted: " + temp);
        return temp;
    }
}

class LinkedList
{    public static void main(String[] args)
    {
        // Creating a doubly linked list
        DoublyLinkedList dl = new DoublyLinkedList();  

        // Adding nodes to the doubly linked list  
        dl.Addfront(2); 
        dl.Addfront(5);  
        dl.Addfront(4);  
        dl.Addfront(6);  

         
  
        //Displays the nodes present in the list  
        dl.iterateForward(); 
    }
}



