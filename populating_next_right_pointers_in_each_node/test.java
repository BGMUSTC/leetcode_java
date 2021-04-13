package populating_next_right_pointers_in_each_node;

import java.util.LinkedList;

public class test {

    public static void main(String[] args) {
        LinkedList<Integer> Q = new LinkedList<>();
        Q.addLast(1);
        Q.addLast(2);
        Q.addLast(3);
        System.out.println(Q.poll());
        System.out.println(Q.poll());
        System.out.println(Q.poll());
    }
}
