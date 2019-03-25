package programs;

import java.util.*;
import java.lang.*;
public class RodCutting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long n,t;
	    Scanner sc=new Scanner(System.in);
	    t=sc.nextLong();
	    while(t>0)
	    {
	        t--;
	        n=sc.nextLong();
	        double c=(Math.log(n+1))/(Math.log(2));
	        int x=(int)c;
	        System.out.println(x-1);
	        
	    }

	}

}
