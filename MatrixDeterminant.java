
import java.util.Scanner;

public class MatrixDeterminant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        int f=0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }



    }
}
