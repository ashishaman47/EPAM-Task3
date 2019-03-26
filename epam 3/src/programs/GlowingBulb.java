package programs;
import java.util.*;

public class GlowingBulb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
        long k;
        int t;
        String s;
        
        t=sc.nextInt();
        while(t>0)
        {
            t--;
            TreeSet<Long> ts = new TreeSet<Long>();
            s=sc.next();
            k=sc.nextLong();
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='1')
                {
                    ts.add((long)i+1);
                }
            }
            
            long d=0,l=ts.first(),q;
            int f=0;
            while(true)
            {
                f=0;
                Iterator<Long> it = ts.iterator();
                while(it.hasNext())
                {
                    if(l%it.next()==0)
                    {
                        f=1;
                        break;
                    }
                }
                if(f==1)
                {
                    q=l;
                    d+=1;
                    if(d==k)
                    {
                        break;
                    }
                }
                l+=1;
            }
            System.out.println(q);
        }
	}

}
