import java.util.Scanner;

public class LinkedList {
  Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }

    }
    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head=newNode;

    }
    public void display() {
        Node current = head;
        while(current != null) {
            System.out.println(current.data+" ");
            current = current.next;
        }
    }
    public void removeAt(int index) {
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(index==0){
            head=head.next;
            return;
        }
        Node current = head;
        for(int i=0; i<index-1; i++) {
            current = current.next;
        }
        if(current==null || current.next==null)
        {
            System.out.println("List is empty");
            return;

        }
        Node next=current.next.next;
        current.next=next;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list  = new LinkedList();
        int size=4;
        for(int i=0; i<size; i++) {
            System.out.print("Enter data: ");
            int data=sc.nextInt();
            list.insert(data);
        }
        System.out.println("Original list");
        list.display();
        System.out.println("Enter index at which you want to remove");
        int i=sc.nextInt();
        list.removeAt(i);
        System.out.println("After removing "+i+" element");
        list.display();


    }
}
