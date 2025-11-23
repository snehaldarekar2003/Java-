package ArrayList;

import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<String>car= new ArrayList<>();

        //oprations
        //add operation
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        car.add("Fortuner");
        car.add("Thar");
        car.add("Shwift");
        car.add("Toyota");
        System.out.println(car);

        //get oparation
        int element =list.get(1);
        System.out.println(element);

        String vehical=car.get(2);
        System.out.println(vehical);

        //delete
        list.remove(2);
        System.out.println(list);

        list.add(1, 9);
        System.out.println(list);

        //set
        list.set(2, 10);
        System.out.println(list);

        //contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(12));

        //size
       int size= list.size();
       System.out.println(size);

       //print arraylist
       for (int i = 0; i < list.size(); i++) {
         System.out.print(list.get(i)+" ");
       }


    }
}
