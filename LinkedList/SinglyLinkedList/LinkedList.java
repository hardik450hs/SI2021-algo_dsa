package LinkedList.SinglyLinkedList;

public class LinkedList {
    static Link head;

    public LinkedList() {
        head = null;
    }

    public void Add(int data) {

        Link newLink = new Link(data);

        if (isEmpty()) {
            head = newLink;

        } else {
            Link current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newLink;
        }
    }

    public void InsertFirst(int data) {
        Link newData = new Link(data);
        newData.next = head;
        head = newData;
    }

    public void removeLast() {
        if (isEmpty()) {
            return;

        } else {
            Link current = head;
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
        Link current = head;
        if (isEmpty()) {
            return;
        } else if (size() == 1) {
            head = null;
        } else {
            head = current.next;
        }
    }

    public void find(int key) {
        Link current = head;
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

        Link current = head;
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

    public void set(int data, int index) {
        int count = 1;
        Link cuurent = head;
        Link newlink = new Link(data);
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

    public int size() {
        Link current = head;
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
        Link current = head;
        while (current != null) {
            current.Display();
            current = current.next;
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return head == null;
    }
}
