package Deque;

public class LinkedDeque<E> {
    private Node<E> front,rear;
    private int size;
    LinkedDeque()
    {
        front =null;
        rear=null;
        size= 0;

    }
    public void OfferFront(E data){
        Node<E> temp = new Node<E>();
        temp.data = data;
        if(front==null){
            front=rear=temp;
            size++;
        }
        else{
            front.prev=temp;
            Node<E> oldFront=front;
            front=temp;
            front.next = oldFront;
            size++;
        }
    }

    public void OfferRear(E data){
        Node<E> temp = new Node<E>();
        temp.data = data;
        if(front==null){
            front=rear=temp;
            size++;  
        }
        else{
            rear.next=temp;
            Node<E> oldRear=rear;
            rear =temp;
            rear.prev=oldRear;
            size++;
        }
    }

    public E polFront(){
        if(front== null) return null;
        Node<E> temp = new Node<E>();
        temp = front;
        front=front.next;
        front.prev=null;
        //temp.next=null;
        System.out.println();
        size--;
        if(front==null)rear=null;
        return temp.data;

    }
    public E polRear(){
        if(front== null) return null;
        Node<E> temp = new Node<E>();
        temp = rear;
        rear=rear.prev;
        rear.next=null;
        //temp.prev=null;
        size--;
        if(front==null)rear=null;
        return temp.data;

    }
    public int size(){
        return size;
    }
    public E peekFront(){
        if(front==null)return null;
        else return front.data;
    }
    public E peekRear(){
        if(front==null)return null;
        else return rear.data;
    }

    public void Display(){
        Node<E> temp = new Node<E>();
        temp=front;
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
    }

    public void Display1(){
        Node<E> temp = new Node<E>();
        temp=rear;
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.prev;
        }
    }
}
