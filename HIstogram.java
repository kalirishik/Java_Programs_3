import java.util.*;
public class HIstogram{
    public static int maxHeight(int h[]){
        int max=0;
        for(int i=0;i<h.length;i++){
            int minHeight=h[i];
            for(int j=i;j<h.length;j++){
                minHeight=Math.min(minHeight,h[j]);
                int area=minHeight*(j-i+1);
                max=Math.max(max,area);
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replace("[","").replace("]","");
        String sp[]=s.split(",");
        int a[]=new int[sp.length];
        for(int i=0;i<sp.length;i++){
            a[i]=Integer.parseInt(sp[i]);
        }
        System.out.println(maxHeight(a));
    }
}
