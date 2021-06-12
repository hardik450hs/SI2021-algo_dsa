package Stack;

public class LinkedStack<E> {
    private Node<E> top;
    private int size;
    public LinkedStack(){
        top=null;
        size=0;
    }

    public void push(E data){
        Node<E> newNode =new Node<E>();
        newNode.data=data;
        newNode.next=top;
        top = newNode;
        size++;
    }
    public E pop(){
        if(size()==0){return null;}
        Node<E> temp = top;
        temp.data = top.data;
        top = top.next;
        size--;
        return temp.data;
    }
    public E peek(){
        if(size()==0){return null;}
        return top.data;
    }
    public int size(){
        return size;
    }
}
