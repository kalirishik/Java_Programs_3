import java.util.*;
public class StringLargestWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String sp[]=s.split(" ");
        int max=0;
        String r="";
        for(int i=0;i<sp.length;i++){
            int l=sp[i].length();
            if(max<l){
                max=l;
                r=String.valueOf(sp[i]);
            }
        }
        System.out.println(r+"="+max);
    }
}
