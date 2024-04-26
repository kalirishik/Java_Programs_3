import java.util.*;
public class IntCharJunk{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        LinkedHashMap<String,String> iVar=new LinkedHashMap<>();
        LinkedHashMap<String,String> cVar=new LinkedHashMap<>();
        String sp[]=s.split(";");
        for(String word:sp){
            String p[]=word.split("\\s+");
            if(p.length>=2){
                String type=p[0];
                String v[]=p[1].split(",");
                for(String variable:v){
                    String varParts[]=variable.split("=");
                    String varName=varParts[0];
                    if(type.equals("int")){
                        if(varParts.length==2){
                            String value=varParts[1];
                            iVar.put(varName,value);
                        }
                        else
                            iVar.put(varName,"junk");
                    }
                    else if(type.equals("char")){
                        if(varParts.length==2){
                            String value=varParts[1];
                            if(value.length()==3)
                                cVar.put(varName,value);
                        }
                        else
                            cVar.put(varName,"junk");
                    }
                }
            }
        }
        System.out.println("Integers");
        for(Map.Entry<String,String> entry1:iVar.entrySet()){
            System.out.println(entry1.getKey()+"="+entry1.getValue());
        }
        System.out.println("Characters");
        for(Map.Entry<String,String> entry2:cVar.entrySet()){
            System.out.println(entry2.getKey()+"="+entry2.getValue());
        }
    }
}