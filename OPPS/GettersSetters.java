package OPPS;

public class GettersSetters {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColur("Blue");
        System.out.println(p1.getColour());
        p1.setTip(4);
        System.out.println(p1.getTip());
    }
}


class Pen {

    //properties+functions
    private String colour;
    private int tip;

    //Getters functions
    String getColour(){
        return this.colour;

    }

    int getTip(){
        return this.tip;
    }

    //setters functions
    void  setColur(String newColour){
        colour = newColour;
    }

    void setTip(int newTip){
        tip=newTip;
    }
}
