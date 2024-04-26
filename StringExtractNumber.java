import java.util.*;
public class StringExtractNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String sp[]=s.split(" ");
        for(int i=0;i<sp.length;i++){
            char c[]=sp[i].toCharArray();
            for(int j=0;j<c.length;j++){
                if(c[j]>=47 && c[j]<=58){
                    System.out.print(c[j]);
                }
            }
            System.out.print(" ");
        }
    }
}
