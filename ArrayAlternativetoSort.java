import java.util.Scanner;
public class ArrayAlternativetoSort {
    static void Sort(int b[]){
        for(int i=0;i<b.length;i++){
            for(int j=i+1;j<b.length;j++){
                if(b[i]>b[j]){
                    int temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        for(int i=0;i<b.length;i++)
            System.out.print(b[i]+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n%2==0?n/2:n/2+1];
        int k=0;
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n;i+=2){
            b[k]=i;
            k++;
        }
        Sort(b);
    }
}
