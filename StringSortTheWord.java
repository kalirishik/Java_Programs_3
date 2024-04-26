import java.util.*;
public class StringSortTheWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String sp[]=s.split(" ");
        Arrays.sort(sp);
        for(int i=0;i<sp.length;i++){
            System.out.print(sp[i]+" ");
        }
    }
}
