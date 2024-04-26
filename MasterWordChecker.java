import java.util.*;
public class MasterWordChecker{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().toLowerCase();
        int brac=0;
        int yer=0;
        int yer1=0;
        char arr[]=str.toCharArray();
        if(arr[arr.length-1]=='{'||arr[arr.length-1]=='['||arr[arr.length-1]==']'||arr[arr.length-1]=='}')
            brac=1;
        String num="";
        for(int i=2;i<arr.length;i++){
            if(arr[i]>='0'&&arr[i]<='9')
                if(arr[i+1]>='0'&&arr[i+1]<='9')
                    num=num+arr[i];
                else
                    num=num+arr[i]+"@";
        }
        String arr2[]=num.split("@");
        int val=Integer.parseInt(arr2[0]);
        int val1=Integer.parseInt(arr2[1]);
        if((arr[0]>='a'&&arr[0]<='z'))
            yer=1;
        if((arr[1]=='a'||arr[1]=='e'||arr[1]=='i'||arr[1]=='o'||arr[1]=='u'))
            yer1=0;
        else
            yer1=1;
        if(yer==1&&yer1==1&&brac==1)
            System.out.print("YES "+(val+val1));
        else
            System.out.print("NO "+(val-val1));
    }
}