import java.util.Scanner;

public class ArrayMaxSumOfTriplets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        int max=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(a[i]<a[j])
                        if(a[j]<a[k])
                            sum=a[i]+a[j]+a[k];
                }
            }
            max=Math.max(sum,max);
        }
        System.out.println(max);
    }
}
