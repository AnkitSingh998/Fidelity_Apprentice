//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LinkedList ll=new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.addFirst(50);
        ll.addLast(60);
        ll.addAt(3,25);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        ll.display();
        ll.removeFirst();
        ll.removeLast();
        ll.display();
        ll.removeAt(1);
    }
}