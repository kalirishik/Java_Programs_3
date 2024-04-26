import java.util.*;
public class StringCountNoOfConstVowelCharDigitsSpecial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next().toUpperCase();
        char c[]=s.toCharArray();
        int c1=0,c2=0,c3=0,c4=0;
        for(int i=0;i<c.length;i++){
            if(c[i]=='A' || c[i]=='E'|| c[i]=='I'|| c[i]=='O'|| c[i]=='U'){
                c1++;
            }
            else if(c[i]>=47 && c[i]<=58){
                c2++;
            }
            else if(c[i]>=65 && c[i]<=90){
                c3++;
            }
            else{
                c4++;
            }
        }
        System.out.println("Vowels = "+c1);
        System.out.println("Consonants = "+c3);
        System.out.println("Digits = "+c2);
        System.out.println("Specials = "+c4);
    }
}
