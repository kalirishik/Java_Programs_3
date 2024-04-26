import  java.util.*;
public class StringFirstNonRepeatingIndex{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int f=0;
        for(char ch:s.toCharArray()){
            if(s.indexOf(ch)==s.lastIndexOf(ch)){
                int i=s.indexOf(ch);
                System.out.println(s.charAt(s.indexOf(ch))+"-"+s.indexOf(ch) +" & "+s.charAt(s.lastIndexOf(ch))+"-"+s.lastIndexOf(ch));
                System.out.print(i+1);
                f=1;
                break;
            }
        }
        if(f!=1)
            System.out.print(-1);

    }
}