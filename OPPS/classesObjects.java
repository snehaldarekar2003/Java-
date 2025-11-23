package OPPS;

public class classesObjects {
    public static void main(String[] args) {
        Pen p1=new Pen();//created a pen object called p1
        p1.setColur("blue");
        System.out.println(p1.colour);
        p1.setTip(5);
        System.out.println(p1.tip);
        // p1.setColur("Black");
        p1.colour="Black";
        System.out.println(p1.colour);

        BankAccount myAcc=new BankAccount();
        myAcc.username="snehal Darekar";
        // myAcc.password="asfgfgfg";//through the error

        myAcc.setPassword("snehal@1@2");
    }
}

class BankAccount{
    public String username;
    private String password;

    public  void setPassword(String pwd){
       password=pwd;
    }
}
class Pen {

    //properties+functions
    String colour;
    int tip;

    void  setColur(String newColour){
        colour = newColour;
    }

    void setTip(int newTip){
        tip=newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy,int chem,int math ){
         percentage=(phy+chem+math)/3;
    }
}
