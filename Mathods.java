import java.util.Scanner;

class A{
    String name="hello A";
    public String toSTring(){
        return name;
    }
    A(){
        System.out.println("HELLO A");
    }
}
class B extends A{
    String name="hello B";
    public String toSTring(){
        return name;
    }
    B(){
        System.out.println("HELLO B");
    }
}
class C extends B{
    String name="hello C";
    public String toSTring(){
        return name;
    }
    C(){
        System.out.println("HELLO C");
    }
}
public class Mathods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        C obj=new C();
//        System.out.println(obj);
//        String s="hemanth";
//        System.out.println(s.substring(2));
//        System.out.println(s.charAt(4));
//        System.out.println(s.length());
//        System.out.println(s.equals("hii"));
//        String s1=sc.nextLine();
//        String s2=sc.next();
//        System.out.println(s1.replaceAll(s2,""));
//        char c[]={'a','b','c'};
//        String s3=s1.copyValueOf(c);
//        System.out.println(s3);
//        String s3="";
//        while(true){
//            if(s1.contains(s2)){
//                s3+=s1.replace(s2,"");
//            }
//            else    break;
//        }
//        System.out.println(s3);
    }
}
