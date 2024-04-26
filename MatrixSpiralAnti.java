import java.util.*;
public class MatrixSpiralAnti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int top = 0;
        int down = m - 1;
        int left = 0;
        int right = n - 1;
        while (top <= down && left <= right) {
            // Print top to bottom
            for (int i = top; i <= down; i++) {
                System.out.print(arr[i][left] + " ");
            }
            left++;
            // Print left to right
            for (int i = left; i <= right; i++) {
                System.out.print(arr[down][i] + " ");
            }
            down--;
            // Print bottom to top
            if (left <= right) { // Check condition before printing
                for (int i = down; i >= top; i--) {
                    System.out.print(arr[i][right] + " ");
                }
                right--;
            }
            // Print right to left
            if (top <= down) { // Check condition before printing
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[top][i] + " ");
                }
                top++;
            }
        }
    }
}
