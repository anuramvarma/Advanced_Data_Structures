class Node 
{
    int data;
    Node next;
    Node(int d) 
    {
        data = d;
        next = null;
    }
}
public class Linked_List 
{
    Node head;
    void createNode(int d) 
    {
        head = new Node(d);
    }
    void display() 
    {
        Node ptr = head;
        while (ptr != null) 
        {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println();
    }
    int countOfNodes() 
    {
        int count = 0;
        Node ptr = head;
        while (ptr != null) 
        {
            count++;
            ptr = ptr.next;
        }
        System.out.println("\nNumber of Nodes = " + count);
        return count;
    }
    void insertAtBeginning(int d) 
    {
        Node temp = new Node(d);
        temp.next = head;
        head = temp;
    }
    void insertAtEnd(int d) 
    {
        Node temp = new Node(d);
        if (head == null) 
        {
            head = temp;
            return;
        }
        Node ptr = head;
        while (ptr.next != null) 
        {
            ptr = ptr.next;
        }
        ptr.next = temp;
    }
    void insertAtPosition(int d, int pos) 
    {
        Node temp = new Node(d);
        if (pos == 1) 
        {
            temp.next = head;
            head = temp;
            return;
        }
        Node ptr = head;
        pos--;
        while (pos != 1 && ptr.next != null) 
        {
            ptr = ptr.next;
            pos--;
        }
        temp.next = ptr.next;
        ptr.next = temp;
    }
    void deleteAtBeginning() 
    {
        if (head != null) 
        {
            Node ptr = head;
            head = head.next;
            ptr = null;
        }
    }
    void deleteAtEnd() 
    {
        if (head == null || head.next == null) 
        {
            head = null;
            return;
        }
        Node ptr = head;
        while (ptr.next.next != null) 
        {
            ptr = ptr.next;
        }
        ptr.next = null;
    }
    void deleteAtPosition(int pos) 
    {
        if (head == null || pos == 1) 
        {
            deleteAtBeginning();
            return;
        }
        Node ptr = head;
        pos--;
        while (pos != 1 && ptr.next != null) 
        {
            ptr = ptr.next;
            pos--;
        }
        if (ptr.next != null) 
        {
            Node temp = ptr.next;
            ptr.next = ptr.next.next;
            temp = null; 
        }
    }
    public static void main(String[] args) 
    {
        Linked_List list = new Linked_List();
        list.createNode(10);
        list.display();
        list.countOfNodes();
        
        System.out.print("Insert at beginning:");
        list.insertAtBeginning(40);
        list.display();
        
        System.out.print("Insert at end:");
        list.insertAtEnd(30);
        list.display();
        
        System.out.print("Inserted at 2nd position:");
        list.insertAtPosition(60, 2);
        list.display();
        
        System.out.print("Deleted at beginning:");
        list.deleteAtBeginning();
        list.display();
        
        System.out.print("Delete at end:");
        list.deleteAtEnd();
        list.display();
        
        System.out.print("Deleted at 2nd position:");
        list.deleteAtPosition(2);
        list.display();
    }
}
