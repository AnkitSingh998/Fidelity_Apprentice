public class LinkedList {
    private Node head;
    private Node tail;
    private int size;
    LinkedList() {
        head=tail=null;
        size=0;
    }
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        if(size==0) {
            tail=newNode;
        }
        size++;
    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        if(size==0) {
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
        size++;
    }
    public void addAt(int index, int data) {
        Node temp=head;
        for(int i=0;i<=index-1;i++) {
            temp=temp.next;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next=newNode;
        size++;
    }
    public int getFirst() {
        return head.data;
    }
    public int getLast() {
        return tail.data;
    }
    public void removeFirst() {
        head=head.next;
        size--;
    }
    public void removeLast() {
        Node temp=head;
        while(temp.next!=null) {
            temp=temp.next;
        }
        temp.next=null;
        size--;
    }
    public void removeAt(int index) {
        Node temp=head;
        for(int i=0;i<=index-1;i++) {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }

    public void display() {
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
