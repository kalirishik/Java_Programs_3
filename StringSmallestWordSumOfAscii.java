import java.util.Scanner;
public class StringSmallestWordSumOfAscii {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String s[]=str.split(" ");
        char ch[]=s[0].toCharArray();
        int min=0;
        for(int i=0;i<ch.length;i++){
            int r=(int)ch[i];
            min+=r;
        }
        String rs=s[0];
        for(int i=1;i<s.length;i++){
            int sum=0;
            char c[]=s[i].toCharArray();
            for(int j=0;j<c.length;j++) {
                int r = (int) c[j];
                sum += r;
            }
            if(sum<min){
                min=sum;
                rs=s[i];
            }
        }
        System.out.println(rs);
    }
}