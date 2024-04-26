import java.util.*;
public class StringReverseNotNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toUpperCase();
        String sp[]=s.split(" ");
        for(int i=0;i<sp.length;i++){
                 int k1=0;
                 String r="";
                 String r2="";
            char c[]=sp[i].toCharArray();
            for(int j=0;j<c.length;j++){
                if(c[j]>=65 && c[j]<=90){
                    r+=c[j]+"";
                }
            }
            StringBuffer sb=new StringBuffer(r);
            r2=sb.reverse().toString();
            for(int j=0;j<c.length;j++){
                if(c[j]>=65 && c[j]<=90){
                    System.out.print(r2.charAt(k1));
                    k1++;
                }
                else{
                    System.out.print(c[j]);
                }
            }
            System.out.print(" ");
        }
    }
}
