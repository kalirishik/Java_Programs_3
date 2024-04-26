import java.util.Scanner;

public class StringNumberAlternatively {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String r="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=47 && s.charAt(i)<=58)
                 r+=s.charAt(i)+"";
        }
        for(int i=0;i<r.length();i+=2){
            System.out.print(r.charAt(i));
        }
    }
}
