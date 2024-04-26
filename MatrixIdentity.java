import java.util.Scanner;

public class MatrixIdentity {
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
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if((i==j) && (a[i][j]==1)){
                    f=1;
                }
                else if(a[i][j]==0){
                    f=1;
                }
                else{
                    f=0;
                    break;
                }
            }
        }
        System.out.println((f==1)?"It is a Identity Matrix":"It is Not a Identity Matrix");
    }
}
