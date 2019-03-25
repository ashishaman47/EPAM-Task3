package programs;
import java.util.*;
import java.lang.*;

public class army {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long s,e,n,p,x;
        Scanner sc=new Scanner(System.in);
        n=sc.nextLong();
        s=sc.nextLong();
        e=sc.nextLong();
        TreeMap<Long,Long> m1 = new TreeMap<Long,Long>();
        
        while(n>0)
        {
            n--;
            x=sc.nextLong();
            p=sc.nextLong();
            m1.put(x-p,x+p);
        }
        
        long area=0;
        long y;
        for(Map.Entry m:m1.entrySet())
        { 
            x=(long)m.getKey();
            y=(long)m.getValue();
            
            if(e<x)
            {
                break;
            }
            if(s < x)
            {
              area=area+x-s;  
            }
            
            if(y > s)
            {
                s=y;
            }
        }
        
        if(s<e)
        {
            area=area+e-s;
        }
        System.out.println(area);

	}

}
