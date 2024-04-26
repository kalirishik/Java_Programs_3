import java.util.*;
public class StringAnagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String sp1[]=s1.split(" ");
        String sp2[]=s2.split(" ");
        for(int i=0;i<sp1.length;i++){
            char c1[]=sp1[i].toCharArray();
            Arrays.sort(c1);
            for(int j=0;j<sp2.length;j++){
                char c2[]=sp2[j].toCharArray();
                Arrays.sort(c2);
                if(Arrays.equals(c1,c2)){
                    System.out.println(sp1[i]+" = "+sp2[j]);
                }
                else{
                    System.out.println(sp1[i]+" != "+sp2[j]);
                }
            }
        }
    }
}
