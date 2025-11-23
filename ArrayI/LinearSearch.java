package ArrayI;

public class LinearSearch {
    public static int linearSearch(int num[],int key ){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;

    }

    public static String myOrder(String menu[],String order){

        for(int i=0;i<menu.length;i++){
            if(menu[i]==order){
                return order;
            }
        }
        return "not available";

    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10,12,14,16};
        String menu[]={"Dosa","gulabjamun","laddu","pizza","burger"};
        int key=20;
        String order="Dosa";

        // int index=linearSearch(num, key);
        // if(index==-1){
        //   System.out.println("not found");
        // }else{
        //     System.out.println("key is at the index:"+index);
        // }
        String result =  myOrder(menu, order);
        if (result =="not available") {
            System.out.println(result);
        } else {
            System.out.println("Your order is:"+order);
        }

       
    }
    
}
