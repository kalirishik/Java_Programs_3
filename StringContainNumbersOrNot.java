import java.util.*;
public class StringContainNumbersOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.matches(".*\\d*."))
            System.out.println("String contains numbers");
        else
            System.out.println("String cannot contains numbers");
    }
}
