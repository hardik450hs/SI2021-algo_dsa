package LinkedList.SinglyLinkedList;

import java.util.Stack;

public class LinkedList<E> {
    protected Link<E> head;

    public LinkedList() {
        head = null;
    }

    public void Add(E data) {

        Link<E> newLink = new Link<E>(data);

        if (isEmpty()) {
            head = newLink;

        } else {
            Link<E> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newLink;

        }
    }

    public void InsertFirst(E data) {
        Link<E> newData = new Link<E>(data);
        newData.next = head;
        head = newData;
    }

    public void removeLast() {
        if (isEmpty()) {
            return;

        } else {
            Link<E> current = head;
            int count = 1;
            while (count < size() - 1) {
                current = current.next;
                count++;
            }
            current.next = null;
        }
    }

    public void removeAll() {
        head = null;
    }

    public void removeFirst() {
        Link<E> current = head;
        if (isEmpty()) {
            return;
        } else if (size() == 1) {
            head = null;
        } else {
            head = current.next;
        }
    }

    public void removeAt(int index) { // get

        Link<E> current = head;
        Link<E> priv = new Link<>(null);
        int count = 0;
        if (size() < index + 1) {
            System.out.println("Invalid Index");
            return;
        }
        while (count <= index) {
            if (count == index - 1) {
                priv = current;
            } else if (count == index) {
                priv.next = current.next;
                return;
            }
            current = current.next;
            count++;

        }

    }

    public void find(E key) {
        Link<E> current = head;
        if (isEmpty()) {
            System.out.println("List is Empty.");
        } else {
            while (current != null) {
                if (current.Data == key) {
                    System.out.println("value " + key + " is found.");
                    return;
                }
                current = current.next;
            }
            System.out.println("Value " + key + " is not found.");
        }

    }

    public void findAt(int index) { // get

        Link<E> current = head;
        int count = 0;
        if (size() < index + 1) {
            System.out.println("Invalid Index");
            return;
        }
        while (count <= index) {
            if (count == index) {
                System.out.println(current.Data);
                return;
            }
            current = current.next;
            count++;

        }

    }

    public void findFromEnd(int index) {

        Link<E> current = head;
        int count = size() - 1;
        if (size() < index + 1) {
            System.out.println("Invalid Index");
            return;
        }
        while (count >= index) {
            if (count == index) {
                System.out.println(current.Data);
                return;
            }
            current = current.next;
            count--;

        }

    }

    public void set(E data, int index) {
        int count = 1;
        Link<E> cuurent = head;
        Link<E> newlink = new Link<E>(data);
        if (index > size() || index < 0) {
            System.out.println("Not possible");
        } else if (index == size()) {
            Add(data);
        } else if (index == 0) {
            InsertFirst(data);
        } else {
            while (count < index) {
                cuurent = cuurent.next;
                count++;
            }
            newlink.next = cuurent.next;
            cuurent.next = newlink;

        }
    }

    public void DisplayMiddle() {
        int index = size();
        if (index % 2 != 0) {
            findAt(index / 2);
        } else {
            findAt((index / 2) - 1);
            findAt(index / 2);
        }
    }

    public int size() {
        Link<E> current = head;
        int count = 0;

        if (isEmpty()) {
            return 0;
        } else {
            while (current != null) {
                count++;
                current = current.next;
            }

            return count;
        }
    }

    public void DisplayLink() {
        Link<E> current = head;
        while (current != null) {
            current.Display();
            current = current.next;

        }
        System.out.println();
    }

    public void DisplayLink(Link<E> L) {
        Link<E> current = L;
        while (current != null) {
            current.Display();
            current = current.next;

        }
        System.out.println();
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void Pelindrome() {
        Stack<E> s = new Stack<E>();
        Link<E> current = head;
        boolean ispalindrome = true;
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        while (current != null) {
            s.push((E) current.Data);
            current = current.next;
        }
        current = head;
        while (current != null) {
            if (s.pop() != current.Data) {
                ispalindrome = false;
                break;
            }
            current = current.next;
        }
        if (ispalindrome == true) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not Palindrome");
        }
    }

    public Link<E> ReverseLL() { //Itterative Method
        return ReverseLL(size());
    }

    public Link<E> ReverseLL(int n) { //Itterative Method up to N
        Link<E> current = head;
        Link<E> Prev = null;
        Link<E> Next = null;
        int count=0;
        while (current != null && count < n ) {
            Next = current.next;
            current.next = Prev;
            Prev = current;
            current = Next;
            count++;
        }
        head.next=Next;
        return Prev;
    }

    public Link<E> ReverseLL(int n,Link<E> L) { //Itterative Method up to N and next elements are reversed too
        if(head == null) return null;
        Link<E> current = head;
        Link<E> Prev = null;
        Link<E> Next = null;
        int count=0;
        while (current != null && count < n ) {
            Next = current.next;
            current.next = Prev;
            Prev = current;
            current = Next;
            count++;
        }
        if(Next!=null){
            head.next=ReverseLL(n, Next);
        }
        //DisplayLink(Prev);
        return Prev;
    }
}
