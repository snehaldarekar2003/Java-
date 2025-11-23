package OPPS;

public class Inheritance {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eat();
    }
}

//Base class
class Animal{
    // String eat;
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breaths(){
        System.out.println("breaths");
    }
       
}

//Derived class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims");
    }
}