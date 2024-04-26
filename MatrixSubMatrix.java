import java.util.*;
public class MatrixSubMatrix{
    public static boolean isSubMatrix(int a[][],int b[][],int c,int r,int l){
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                if(a[i+r][j+c]!=b[i][j])
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        boolean f=false;
        int N=sc.nextInt();
        int a[][]=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int M=sc.nextInt();
        int b[][]=new int[M][M];
        for(int i=0;i<M;i++){
            for(int j=0;j<M;j++){
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<=N-M;i++){
            for(int j=0;j<=N-M;j++){
                if(isSubMatrix(a,b,i,j,M)){
                    f=true;
                    break;
                }
            }
            if(f)
                break;
        }
        if(f)
            System.out.print("True");
        else
            System.out.print("False");

    }
}