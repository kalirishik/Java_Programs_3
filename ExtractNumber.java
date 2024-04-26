
import java.util.*;
public class ExtractNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int flag=0;
        for(int i=0;i<n;i++)
        {
            String a=sc.nextLine();
            flag=0;
            ArrayList<String> al=new ArrayList<>();
            String[] w=a.split(" ");
            for(int j=0;j<w.length;j++)
            {
                al.add(w[j]);
            }
            for(int k=0;k<al.size();k++)
            {
                String y=al.get(k);
                if(y.contains("9"))
                {
                    continue;
                }
                else if(y.contains("0") || y.contains("1") ||y.contains("2") ||y.contains("3") ||y.contains("4") ||y.contains("5") ||y.contains("6") ||y.contains("7") ||y.contains("8"))
                {
                    for(int u=0;u<y.length();u++)
                    {
                        if(y.charAt(u)>='0' && y.charAt(u)<='8')
                        {
                            if(u!=y.length()-1)
                            {
                                System.out.print(y.charAt(u));
                                flag++;
                            }
                            else
                            {
                                System.out.print(y.charAt(u)+" ");
                                flag++;
                            }
                        }
                    }

                }
            }
        }
        System.out.println();
        if(flag==0)
        {
            System.out.print(-1);
        }
    }
}
