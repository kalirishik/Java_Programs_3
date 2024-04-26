import java.util.*;
public class StringPrintConsecutiveVowelLetters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        String sp[]=s.split(" ");
        int f;
        for(int i=0;i<sp.length;i++){
            f=0;
            for(int j=0;j<sp[i].length()-1;j++) {
                if (sp[i].charAt(j) == 'a' || sp[i].charAt(j) == 'e' || sp[i].charAt(j) == 'i' || sp[i].charAt(j) == 'o' || sp[i].charAt(j) == 'u') {
                    String ns = sp[i].charAt(j) + "";
                     {
                        f = 1;
                        break;
                    }
                }
            }
                if(f==1)
                        System.out.println(sp[i] + "- Consecutive Vowels");
                else{
                    System.out.println(sp[i]+"- Non Consecutive Vowels");
                }

        }
    }
}
