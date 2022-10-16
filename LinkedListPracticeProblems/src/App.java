import java.util.LinkedList;
public class App {
    public static void main(String[] args) {
        LinkedList<Integer> Data = new LinkedList<Integer>();
        Data.add(10);
        Data.add(20);
        Data.add(30);
        System.out.println(Data.toString());
        Data.removeLast();
        Data.addFirst(30);
        System.out.println(Data.toString());
        LinkedList<Integer> List1 = new LinkedList<Integer>();
        LinkedList<Integer> List2 = new LinkedList<Integer>();
        List1.add(10);
        List1.add(20);
        List2.add(30);
        List2.add(40);
        List1.removeFirst();
        List1.addFirst(30);
        List1.addFirst(10);
        List2.removeFirst();
        LinkedList<Integer> List3 = new LinkedList<Integer>();
        for(int i = 10; i <= 990; i+=10){
            List3.add(i);
        }
        List3.add(1000);
        

    }
}
