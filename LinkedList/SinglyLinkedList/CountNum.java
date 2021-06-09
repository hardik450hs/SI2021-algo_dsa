package LinkedList.SinglyLinkedList;

public class CountNum<E> extends LinkedList<E> {
    public int Count(E data){
        Link<E> cur = head;
        int count= 0;
        while(cur!=null){
            if(cur.Data==data){
                count++;
            }
            cur=cur.next;
        }
        return count;
    }

    public static void main(String[] args) {
        CountNum<String> s = new CountNum<String>();

        s.Add("Hardik");
        s.Add("Priyank");
        s.Add("Hardik");
        s.Add("Ronak");
        s.Add("Abhi");

        System.out.println(s.Count("Ajay"));
    }
}
