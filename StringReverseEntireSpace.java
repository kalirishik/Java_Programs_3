import java.util.*;
public class StringReverseEntireSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char c[]=s.toCharArray();
        String ns=" ";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ')
                ns+=s.charAt(i);
        }
        StringBuffer sb=new StringBuffer(ns);
        String r=sb.reverse().toString();
        int e=0;
        for(int i=0;i<c.length;i++){
            if(c[i]>=65 && c[i]<=90 || c[i]>=97 && c[i]<=122){
                System.out.print(r.charAt(e++));
            }
            else{
                System.out.print(c[i]);
            }
        }

    }
}
