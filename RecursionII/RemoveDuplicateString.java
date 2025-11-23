package RecursionII;

public class RemoveDuplicateString {
    public static void removeDupilicate(String str,int idx,StringBuilder newString,boolean map[] ){
       if (idx==str.length()) {
        System.out.println(newString);
        return;
       }

       char currChar = str.charAt(idx);

       if (map[currChar-'a']==true) {
        //then it was duplicate string
        removeDupilicate(str, idx+1, newString, map);
       }else{
        map[currChar-'a']=true;
        removeDupilicate(str, idx+1, newString.append(currChar), map);
       }
    }
    public static void main(String[] args) {
        String str="appanacollege";
        removeDupilicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
