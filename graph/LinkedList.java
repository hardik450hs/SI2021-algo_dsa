package graph;

public class LinkedList<T> {
    protected Node<T> head = new Node<T>(null);
    public Node<T> Insert(T key){
        Node<T> newNode = new Node<T>(key);
        if(head==null){
            head=newNode; 
        }
        else{
            Node<T> curr= head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=newNode;
        }
        return head;
    }
}
