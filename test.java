import java.util.LinkedList;

public class test {

    public static void main(String[] args) {
        LinkedList<Integer> ss = new LinkedList<>();
        ss.addLast(1);
        ss.addLast(2);
        ss.addLast(3);
        ss.addLast(4);
        while (!ss.isEmpty()) {
            System.out.println(ss.pollLast());
        }
    }
}
