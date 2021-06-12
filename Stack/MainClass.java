package Stack;

public class MainClass {
    public static void main(String[] args) {
        LinkedStack<Integer> s =new  LinkedStack<Integer>();
        System.out.println(s.size());
        s.push(5);
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.size());
    }
}
