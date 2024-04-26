import java.util.*;
public class FindAllDublicateElements {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String sp[]=s.split("[,{\\}]");
        Arrays.sort(sp);
        int f=0;
        for(int i=0;i<sp.length;i++){
            for(int j=i+1;j<sp.length-1;j++){
                if(sp[i].equals(sp[j])){
                    System.out.print(sp[j]+" ");
                    f=1;
                }
            }
        }
        if(f!=1)
            System.out.print(-1);

    }
}