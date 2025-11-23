package Hashing;
import java. util.*;
public class HashMapImplementation {
    static class HashMap <K,V>{//generic
       private class Node {
        K key;
        V value;

        public Node(K key,V value){
            this.key=key;
            this.value=value;
        }
       }
       private int size;//n
       private LinkedList<Node>buckets[];//N

       @SuppressWarnings("unchecked")
       public HashMap(){
           this.size=0;
           this.buckets=new LinkedList[4];
           for(int i=0;i<4;i++){
            this.buckets[i]=new LinkedList<>();
           }
       }

       private int hashFunction(K key){
           int hc=key.hashCode();
           return Math.abs(hc)%4;


       }

       public void put(K key,V value){
        int bi=hashFunction(key);//bi:bucket index
        int di=SearchInLL(key);//di=data index
       }
        
        
    }
    public static void main(String[] args) {
        
    }
}
