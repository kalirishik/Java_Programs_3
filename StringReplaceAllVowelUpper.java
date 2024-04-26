import java.util.*;
public class StringReplaceAllVowelUpper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String str1=s.replaceAll("[aeiou|AEIOU]","@");
        String str2=str1.replaceAll("[A-Z]","s");
        System.out.print(str2);
    }
}
