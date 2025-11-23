package Queues;

import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque {
     static class Queue {
       Deque<Integer> deque = new LinkedList<>();

       //push
       public void push(int data){
        deque.addFirst(data);
       }

       //pop
       public int pop(){
        return deque.removeLast();
       }

       //peek
       public int peek(){
        return deque.getFirst();
       }
        
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.push(1);
        q.push(2);
        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.pop());
        

    }
}
