import java.util.Scanner;
import java.util.regex.*;
public class MobileValidation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        Pattern p=Pattern.compile("[a-z]+[A-Z]+[0-9]+[A-Za-z0-9]{5}");
        Matcher m=p.matcher(n);
        if(m.find())
            System.out.println("true");
        else
            System.out.println("false");


    }
}
