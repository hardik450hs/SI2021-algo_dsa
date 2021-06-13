package Deque;

public class MainClass {
    public static void main(String[] args) {
        LinkedDeque<Integer> d = new LinkedDeque<>();
        System.out.println(d.size());
        d.OfferFront(5);
        d.OfferFront(10);;
        d.OfferRear(15);
        d.OfferRear(25);
        System.out.println(d.size());
        System.out.println(d.peekFront());
        System.out.println(d.peekRear());
        //d.polFront();
        //d.polRear();
        d.Display();
        System.out.println();
        d.Display1();
        System.out.println();
        System.out.println(d.size());
    }
    
    
}
