import java.util.*;
public class StringSecongSmallestWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String sp[]=s.split(" ");
        int l[]=new int[sp.length];
        for(int i=0;i<sp.length;i++){
            l[i]=sp[i].length();
        }
        Arrays.sort(l);
        int c=0,min=0;
        for(int j=0;j<l.length;j++){
            if(min<l[j]) {
                min = l[j];
                c++;
            }
            if(c==2)
                break;
        }
        System.out.println(min+1);
    }
}
