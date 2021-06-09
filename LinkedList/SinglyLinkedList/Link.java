package LinkedList.SinglyLinkedList;

public class Link<E> {
    E Data;
    Link<E> next;
    
    public Link(E Data){
        this.Data=Data;
        this.next=null;
    }
    public void Display(){
        System.out.print(Data +" ");
    }
}
