package OPPS;

public class Statickeyword {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.schoolName="XYZ";

        Student s2=new Student();
        System.out.println(s2.schoolName);
        // s2.schoolName="abc";
        System.out.println("s2 perentage: "+s2.Persentage(60,90,90));

        Student s3=new Student();
        s3.schoolName="abcd";
       System.out.println( "s3 persentage: "+s3.Persentage(60, 70, 80));

       System.out.println(s1.schoolName);
        

    
    }
}
class Student{
    static int Persentage(int math,int phy,int chem){
         return(math+phy+chem)/3;
    }
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
         this.name=name;
    }

    String getName(){
        return name;
    }
}
