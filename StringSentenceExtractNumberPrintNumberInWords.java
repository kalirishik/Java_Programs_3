import java.util.*;
public class StringSentenceExtractNumberPrintNumberInWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String sp[]=s.split(" ");
        String d="";
        for(int i=0;i<sp.length;i++){
            char c[]=sp[i].toCharArray();
            for(int j=0;j<c.length;j++){
                if(c[j]>=47 && c[j]<=58){
                  d+=c[j]+"";
                }
            }
            int ds=Integer.parseInt(d);
            int l=(int)Math.log10(ds);
            while(l!=-1){
                int f=(int)(ds/Math.pow(10,l))%10;
                if(f==0)
                    System.out.print("ZERO ");
                else if(f==1)
                    System.out.print("ONE ");
                else if(f==2)
                    System.out.print("TWO ");
                else if(f==3)
                    System.out.print("THREE ");
                else if(f==4)
                    System.out.print("FOUR ");
                else if(f==5)
                    System.out.print("FIVE ");
                else if(f==6)
                    System.out.print("SIX ");
                else if(f==7)
                    System.out.print("SEVEN ");
                else if(f==8)
                    System.out.print("EIGHT ");
                else if(f==9)
                    System.out.print("NINE");
                l-=1;
            }
            d="";
        }
    }
}
