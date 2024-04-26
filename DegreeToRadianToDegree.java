import java.util.Scanner;

public class DegreeToRadianToDegree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double d=sc.nextDouble();
        double r=Math.toRadians(d);
        System.out.println(r);
        double dr=Math.toDegrees(r);
        System.out.println(dr);
    }
}
