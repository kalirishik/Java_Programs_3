import java.util.Scanner;

public class MatrixSparse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
                if(a[i][j]==0)
                    count++;
            }
        }
        System.out.println((count>(r*c)/2)?"It is Sparse Matrix":"It is Not Sparse Matrix");
    }
}
