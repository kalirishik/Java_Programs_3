import java.util.*;
public class IntegerToRomanLetter{
    static String noToRoman(int n){
        TreeMap<Integer,String> romanMap=new TreeMap<>();
        romanMap.put(1,"I");
        romanMap.put(4,"IV");
        romanMap.put(5,"V");
        romanMap.put(9,"IX");
        romanMap.put(10,"X");
        romanMap.put(40,"XL");
        romanMap.put(50,"L");
        romanMap.put(90,"XC");
        romanMap.put(100,"C");
        romanMap.put(400,"CD");
        romanMap.put(500,"C");
        romanMap.put(900,"CM");
        romanMap.put(1000,"M");
        romanMap.put(4000,"M V̅");
        romanMap.put(5000,"V̅");
        romanMap.put(9000,"MX̅̅");
        romanMap.put(10000,"X̅̅");
        int l=romanMap.floorKey(n);
        if(n==l){
            return romanMap.get(n);
        }
        return romanMap.get(l)+ noToRoman(n-l);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int r=sc.nextInt();
            if(r>10000)
                System.out.println("Invalid");
            else
                System.out.println(noToRoman(r));

        }
    }
}