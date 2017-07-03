import java.io.*;
import java.util.*;
class isdigit
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner (System.in);
        String s1=sc.next();
        int sum=0;
        for(int i=0;i<s1.length();i++)
        {
            if(Character.isDigit(s1.charAt(i)))
            {
               sum=sum+Integer.parseInt(String.valueOf(s1.charAt(i)));
            }
        }
        System.out.println(sum);
        
    }
}
