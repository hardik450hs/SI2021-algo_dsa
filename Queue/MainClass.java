package Queue;

public class MainClass {
    public static void main(String[] args) {
        LinkedQueue<Integer> q = new LinkedQueue<>();
        q.offer(5);
        q.offer(10);
        System.out.println(q.pol());
        System.out.println(q.pol());
    }
}
