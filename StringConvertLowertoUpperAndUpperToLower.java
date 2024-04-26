import java.util.*;
public class StringConvertLowertoUpperAndUpperToLower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90)
                System.out.print(Character.toLowerCase(s.charAt(i)));
            else if (s.charAt(i)>=97 && s.charAt(i)<=122) {
                System.out.print(Character.toUpperCase(s.charAt(i)));
            }
        }
    }
}
