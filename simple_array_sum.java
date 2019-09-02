import java.util.*;
public class array_sum
{
    public static void main(String args[])
    {
        int s=0;                                     //s=sum
        Scanner in = new Scanner(System.in);
        
        int n=in.nextInt();
        int ar[]=new int[n];
        if(n>0)
        {
        for(int a=0;a<n;a++)
        {
            ar[a]=in.nextInt();
        if(ar[a]<=1000)
        {
            s=s+ar[a];
        }
        }
        System.out.println(s);
    }
}}

