import java.util.*;
public class FIndThirdSmallestNumberSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        TreeSet<Integer> ts=new TreeSet<>();
        int c=0,sum=0,f=0;
        for(int i=0;i<n;i++){
            int t=sc.nextInt();
            a[i]=t;
            ts.add(t);
        }
        ArrayList<Integer> al=new ArrayList<>(ts);
        int min=al.size()>=3?al.get(2):-1;
        if(min>0){
         for(int i=0;i<n;i++){
            if(min==a[i]){
                break;
            }
            else {
                sum+=a[i];
                f=1;
            }
          }

        }
        if(f==1){
            System.out.println(min +" "+sum);
        }
        else{
            System.out.println("-1");
        }
    }
}