import java.util.Scanner;

public class StringPrintCharAlternativelyReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(int i=s.length()-1;i>=0;i-=2){
            System.out.print(s.charAt(i));
        }
    }
}
