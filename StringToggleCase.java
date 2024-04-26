import java.util.*;
public class StringToggleCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            if(i%2==0)
                System.out.print(Character.toUpperCase(s.charAt(i)));
            else
                System.out.print(Character.toLowerCase(s.charAt(i)));
        }
    }
}
