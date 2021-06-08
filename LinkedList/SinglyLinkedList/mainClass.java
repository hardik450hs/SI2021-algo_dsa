package LinkedList.SinglyLinkedList;

public class mainClass {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        
        ll.Add(5);
        ll.Add(15);
        ll.Add(2);
        ll.InsertFirst(100);
        ll.DisplayLink();
        
        System.out.println(ll.size());
        ll.removeLast();
        ll.DisplayLink();
        //ll.removeAll();
        ll.DisplayLink();
        System.out.println(ll.size());
        ll.removeFirst();
        ll.DisplayLink();
        System.out.println(ll.isEmpty());
        ll.Add(14);
        ll.Add(17);
        ll.Add(26);
        ll.DisplayLink();
        ll.find(14);
        ll.find(27);
        ll.findAt(3);
        ll.findAt(6);
        ll.findAt(0);
        ll.set(101, 0);
        ll.DisplayLink();
    }
}
