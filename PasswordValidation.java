import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Pattern p=Pattern.compile("[a-z]+[A-z]+[0-9]+[@$#]{1}");
        Matcher m=p.matcher(s);
        if(m.find())
            System.out.println("true");
        else
            System.out.println("false");
    }
}
