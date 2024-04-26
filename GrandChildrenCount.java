import java.util.*;
public class GrandChildrenCount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        LinkedHashMap<String,String> hm=new LinkedHashMap<>();
        for(int i=0;i<t;i++){
            hm.put(sc.next(),sc.next());
        }
        String s=sc.next();
        String f="";
        int c=0;
        for(Map.Entry<String,String> entry1:hm.entrySet()){
            String v1=entry1.getValue();
            if(s.equals(v1))
                f=entry1.getKey();
            if(!(f.equals(""))){
                for(Map.Entry<String,String> entry2:hm.entrySet()){
                    String v2=entry2.getValue();
                    if(f.equals(v2))
                        c++;
                }
            }
        }
        System.out.print(c/2);
    }
}
