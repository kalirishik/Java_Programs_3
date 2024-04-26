import java.util.*;
public class StringReplaceAllOneToNine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        s=s.replaceAll("1","9");
        System.out.println(s);
    }
}
