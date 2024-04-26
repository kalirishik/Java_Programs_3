import java.util.Scanner;
public class StringReplaceAllVowelWithSpaceCountWords {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String s[]=str.split(" ");
        String r="";
        for(int i=0;i<s.length;i++) {
            String sp= s[i].replaceAll("[aeiou]", " ");
            r+=sp;
            System.out.println(r);
        }
        String sp[]=r.split(" ");
        System.out.println(sp.length);
    }
}