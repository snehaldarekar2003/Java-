package String;

public class lecture {
    //for given string convert each the first letter of each word to uppercase
    public static void firstletterUpcase(){
            String str="Hii i am snehal darekar";

            StringBuilder sb=new StringBuilder("");

            char ch=Character.toUpperCase(str.charAt(0));
            sb.append(ch);

            for(int i=1;i<str.length();i++){
                if (str.charAt(i)==' ' && i<str.length()-1) {
                    sb.append(str.charAt(i));
                    i++;
                    sb.append(Character.toUpperCase(str.charAt(i)));
                } else {
                    sb.append(str.charAt(i));
                }
            }
            System.out.println(sb.toString());

    }
    public static void main(String[] args) {
        //Substring
        // String str = "Hello World";
        // System.out.println(str.substring(0,5));

        // String fruits[]={"apple","mango","banana"};

        // String largest = fruits[0];
        // for(int i=1;i<fruits.length;i++){
        //     if (largest.compareTo(fruits[i])<0){
        //         largest=fruits[i];
        //     }
        // }

        // System.out.println(largest);

        // //string builder
        // StringBuilder sb=new StringBuilder("");
        // for(char ch='a';ch<='z';ch++){
        //     sb.append(ch);
        // }
        // System.out.println(sb);

        firstletterUpcase();
    }
}
