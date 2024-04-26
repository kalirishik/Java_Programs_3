import java.util.*;
public class StringReplaceAllVowelDigitConsonents {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next().toLowerCase();
        s=s.replaceAll("a|e|i|o|u","VOWEL ");
        s=s.replaceAll("[0-9]","DIGIT ");
        s=s.replaceAll("[a-z]","CONSONANT ");
        System.out.println(s);
    }
}
