import java.util.Arrays;
import java.util.Scanner;

public class MatrixSymmetric {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int f=0;
        int a[][]=new int[r][c];
        int b[][]=new int[c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                b[i][j] =a[j][i];
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(a[i][j]==b[i][j]){
                    f=1;
                }
                else{
                    f=0;
                    break;
                }
            }
        }
        if(f==1){
            System.out.println("It is a Symmetric");
        }
        else{
            System.out.println("It is not a Symmetric");
        }
    }
}
