import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class StringContainsOnlyVowelsOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next().toLowerCase();
        Pattern p=Pattern.compile("aeiou|eioua|iouae|ouaei|uaeio");
        Matcher m=p.matcher(s);
        if(m.find()){
            System.out.println("String  contains only vowels");
        }
        else{
            System.out.println("String doesn't contains only vowels");

        }
    }
}
