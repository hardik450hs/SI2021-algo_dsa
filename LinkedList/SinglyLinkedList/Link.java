package LinkedList.SinglyLinkedList;

public class Link {
    int Data;
    Link next;
    public Link(int Data){
        this.Data=Data;
        this.next=null;
    }
    public void Display(){
        System.out.print(Data +" ");
    }
}
