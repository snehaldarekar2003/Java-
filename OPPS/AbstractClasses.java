package OPPS;

public class AbstractClasses {
    public static void main(String[] args) {
        // Horse h= new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);

        // Chicken c= new Chicken();
        // c.eat();
        // c.walk();

        // Animal a=new Animal();//abstract classes cant make object
         
        
        //herirachi of calling cunstructor
        //Mustang m=new Mustang();
        //Animal->Horse->Mustang
    }
}

// abstract class Animal {
//     String color;
//     Animal(){
//         System.out.println("animal constructor called");
//     }
//     void eat(){
//         System.out.println("animal eats");
//     }

//     abstract void walk();
// }

//  class Horse extends Animal {
//     Horse(){
//         System.out.println("Horse constructor called");
//     }
//     void changeColor(){
//         color="black";
//     }
//      void walk(){
//         System.out.println("Walk on 4 legs");
//      }
    
// }

// class Mustang extends Horse{
//     Mustang(){
//         System.out.println("Mustang constructor is called ");
//     }
// }

// // class Chicken extends Animal{

// //     void changeColor(){
// //         color="Yellow";
// //     }
// //     void walk(){
// //         System.out.println("Walks on 2 legs");
// //     }

// // }
