package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(1);
        pq.add(2);//O(logn)
        pq.add(7);
        pq.add(4);
        pq.add(8);
        
        while (!pq.isEmpty()) {
            System.out.print(pq.peek()+" ");
            pq.remove();//O(log n)
        }
    }
}
