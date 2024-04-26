import java.util.*;
public class StringReplacecharIS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String sp[]=s.split(" ");
        for(int i=0;i<sp.length;i++){
            String str=sp[i].replaceFirst("i","s");
        System.out.print(str+" ");
        }
    }
}
