import java.util.*;
public class StringConatainsExtraSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int f=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ' && s.charAt(i+1)==' '){
                f=1;
                break;
            }
        }
        System.out.println(f==1?"true":"false");
    }
}
