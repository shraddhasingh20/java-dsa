public class Leetcode {
    public static String toLowerCase(String s) {
         StringBuilder sb= new StringBuilder();
        for (char ch: s.toCharArray()){
            if(ch>='A'&& ch<='Z'){
                sb.append((char)(ch+32));
            }
            else{
                sb.append(ch);
            }

        }
        return sb.toString();

    }
public static void main(String args[]){
    System.out.println("HELLO");
}
}

