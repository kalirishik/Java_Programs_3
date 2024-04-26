import java.util.*;
public class StringReverseVowelWOrdsOnly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toUpperCase();
        String sp[]=s.split(" ");
        int k=0;
        String r1="";
        for(int i=0;i<sp.length;i++){
            char c[]=sp[i].toCharArray();
            for(int j=0;j<c.length;j++){
                if(c[j]=='A' ||c[j]=='E' ||c[j]=='I' ||c[j]=='O' ||c[j]=='U' ){
                    r1+=c[j]+"";
                }
            }
            StringBuffer sb=new StringBuffer(r1);
            sb.reverse();
            r1=sb.toString();
            for(int j=0;j<c.length;j++){
                if(c[j]=='A' ||c[j]=='E' ||c[j]=='I' ||c[j]=='O' ||c[j]=='U' ){
                    System.out.print(r1.charAt(k));
                    k++;
                }
                else {
                    System.out.print(c[j]);
                }
            }
            System.out.print(" ");
        }
    }
}
