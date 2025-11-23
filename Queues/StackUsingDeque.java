package Queues;

import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque {

    static class Stack {
       Deque<Integer> deque = new LinkedList<>();

       //push
       public void push(int data){
        deque.addLast(data);
       }

       //pop
       public int pop(){
        return deque.removeFirst();
       }

       //peek
       public int peek(){
        return deque.getLast();
       }
        
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        

    }
}
