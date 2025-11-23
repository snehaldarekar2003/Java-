package BST;
import java.util.*;
public class RootToLeafPath {
    static class Node {
        int data;
        Node left,right;
    
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
            
    }
    public static void printPath(ArrayList<Integer>path) {
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }
    public static void prinRoot2Leaf(Node root,ArrayList<Integer>path){
       if (root==null){
        return;
       }
        
        path.add(root.data);
        if (root.left==null&&root.right==null){
            printPath(path);
        }
        prinRoot2Leaf(root.left,path);
        prinRoot2Leaf(root.right,path);
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        prinRoot2Leaf(root,new ArrayList<>());
    }
    
}