import java.util.*;
public class StringReverseAlternate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String sp[]=s.split(" ");
        for(int i=0;i<sp.length;i++){
            if(i%2==0){
                StringBuffer sb=new StringBuffer(sp[i]);
                System.out.print(sb.reverse()+" ");
            }
            else
                System.out.print(sp[i]+" ");
        }
    }
}
