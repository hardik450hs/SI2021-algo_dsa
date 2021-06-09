package LinkedList.SinglyLinkedList;

public class MinMaxLL extends LinkedList<Integer> {
    public void MinMax(){
        Link<Integer> current= head;
        int min = current.Data;
        int max = current.Data;
        while (current!=null) {
            if(current.Data < min){
                min = current.Data;
            }
            if(current.Data > max){
                max = current.Data;
            }
            current = current.next;
        }
        System.out.println(min);
        System.out.println(max);
    }

    public static void main(String[] args) {
        MinMaxLL l = new MinMaxLL();

        l.Add(5);
        l.Add(25);
        l.Add(56);
        l.Add(58);
        l.Add(15);
        l.Add(50);
        l.Add(65);
        l.Add(85);
        l.Add(51);
        l.Add(74);
        l.Add(2);
        l.MinMax();
        l.find(5);
        
    }
}
