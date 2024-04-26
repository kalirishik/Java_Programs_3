import java.util.*;
public class StringSubstringOneByOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=s.length();
        for(int i=1;i<=l;i++){
            System.out.println(s.substring(0,i));
        }
    }
}
