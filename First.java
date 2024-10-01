public class First {
    private Node head;
    private Node tail;
    private int size;
    First()
    {
        head = null;
        size=0;
    }
    public void addf(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head=newNode;
        if(size==0)
            tail=newNode;

        size++;
    }
    public void addl(int data)
    {
        Node newNode = new Node(data);
        if(size==0)
            head=tail=newNode;
        tail.next=newNode;
        tail=newNode;
        size++;
    }
    public void addAt(int data,int position)
    {
        Node temp=head;
        for(int i=0;i<=position-1;i++)
        {
            temp=temp.next;
        }
        Node newNode = new Node(data);
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
    }

    public void Display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void reverse()
    {
        Node prev=null;
        Node current=head;
        Node next=null;
        while(current!=null)
        {
            next=current.next;
           current.next=prev;
           prev=current;
           current=next;
        }
        head=prev;

    }


}
