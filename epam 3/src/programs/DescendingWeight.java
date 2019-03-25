package programs;
import java.util.*;

public class DescendingWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
        long n,k,x;
        n=sc.nextLong();
        k=sc.nextLong();
        ArrayList<Long> a = new ArrayList<Long>();
        TreeMap<Long,ArrayList> m = new TreeMap<Long,ArrayList>(Collections.reverseOrder());
        
        for(long i=k-1;i>=0;i--)
        {
            ArrayList<Long> b1 =new ArrayList<Long>();
            m.put(i,b1);
        }
        while(n>0)
        {
             x=sc.nextLong();
             a.add(x);
             n--;
        }
        Collections.sort(a);
        Iterator itr = a.iterator();
        while(itr.hasNext())
        {
            ArrayList<Long> b =new ArrayList<Long>();
            x=(long)itr.next();
            long y;
            y=(long)x%k;
            b=(ArrayList)m.get(y);
            b.add(x);
            m.put(y,b);
        }
        
        for(Map.Entry q:m.entrySet())
        {
            ArrayList<Long> b =new ArrayList<Long>();
            b=(ArrayList)q.getValue();
            Iterator it = b.iterator();
            
            while(it.hasNext())
            {
                System.out.print(it.next()+" ");
            }
            
            
        }
	}

}
