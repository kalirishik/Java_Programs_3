import java.util.*;
public class PortalReverseStar{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String temp=str;
        String built="";
        String special="";
        String arr[]=temp.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            char arr1[]=arr[i].toCharArray();
            for(int j=arr1.length-1;j>=0;j--)
                if((arr1[j]>='a'&&arr1[j]<='z')||(arr1[j]>='A'&&arr1[j]<='Z'))
                    built+=arr1[j];

        }
        int f=0;
        // System.out.println(built);
        for(int j=0;j<arr.length;j++){
            char arr1[]=arr[j].toCharArray();
            for(int i=0;i<arr1.length;i++){
                if((arr1[i]>='a'&&arr1[i]<='z')||(arr1[i]>='A'&&arr1[i]<='Z'))
                    System.out.print(built.charAt(f++));
                else
                    System.out.print(arr1[i]);
            }
            System.out.print(" ");
        }

    }
}