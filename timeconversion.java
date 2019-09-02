import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class time_con {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String time = in.next();
    int size=time.length();
    String s[]=time.split(":"); 
    String t=time.substring(size-2,size) ;
    String hh="";
    String mm="",ss="";
     hh=s[0];
     mm=s[1];
    ss=s[2].substring(0,2);
    if(hh.equals("12") || hh.equals("24")){
            if(t.equals("AM")){
                hh = "00";
                System.out.println(hh+":"+mm+":"+ss);
            } else 
                if(t.equals("PM")){
                hh = "12";
                System.out.println(hh+":"+mm+":"+ss);
            }
        }
    else

    if((Integer.parseInt(hh)) <12 && t.equals("AM"))
        {
        System.out.println(hh+":"+mm+":"+ss);
    }
    else 
        {
        System.out.println((Integer.parseInt(hh)+12)+":"+mm+":"+ss);
        }
   }
}
