import java.util.Scanner;

public class MatrixSkew {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        int f=0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                b[i][j]=a[j][i];
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j]=a[i][j]*-1;
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(a[i][j]==b[i][j]){
                    f=1;
                }
                else{
                    f=0;
                    break;
                }
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        if(f==1){
            System.out.println("It is a Skew Matrix");
        }
        else{
            System.out.println("It is Not a Skew Matrix");
        }
    }
}
