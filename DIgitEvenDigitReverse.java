import java.util.*;
public class DIgitEvenDigitReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String result="";
        for(int i=s.length()-1;i>=0;i--){
            String sp=s.charAt(i)+"";
            if(Integer.parseInt(sp)%2==0)
                    result+=sp;
        }
        StringBuffer sb=new StringBuffer(result);
        System.out.println(sb.reverse());
    }
}
