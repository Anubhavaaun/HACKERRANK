import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class mms {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        long[] ar = new long[5];    
        long max = 0, min= 0 , sum =0;
        ar[0] = max = min = sum = in.nextLong();
        for (int a = 1; a < 5; a++) 
        {
            ar[a] = in.nextLong();
            if(ar[a]>max) 
            {
                max = ar[a];
            }
            if(ar[a]<min)
            { 
                min = ar[a];
            }
            sum =sum+ar[a];
            
        }
        System.out.println( (sum - max)+" "+(sum - min));
    }
}
