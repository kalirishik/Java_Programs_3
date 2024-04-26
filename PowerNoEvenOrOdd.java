import java.util.Scanner;

public class PowerNoEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        long r=(long)Math.pow(n,p);
        System.out.println(r);
        System.out.println(r%2==0?"Even":"odd");
        System.out.println(n%2==0?"Even":"Odd");
    }
}
