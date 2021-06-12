package Queue;

public class LinkedQueue<E> {
    private Node<E> top,rear;
    private int size;
    LinkedQueue(){
        top = null;
        rear = null;
        size=0;
    }
    public void offer(E data){
        Node<E> temp = new Node<E>();
        temp.data=data;
        if(top==null){
            top=rear=temp;
            size++;
        }
        else{
            rear.next=temp;
            rear = rear.next;  
            size++;          
        }

    }
    public E pol(){
        if(top==null) return null;
        else{
            Node<E> temp = new Node<E>();
            temp = top;
            top = top.next;
            size--;
            if(top==null) rear=null;
            return temp.data;
        }
    }
    public E peek(){
        return top.data;
    }
    public int size(){
        return size;
    }
}
