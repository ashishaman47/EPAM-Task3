package program;

import java.io.*;
import java.util.*;

public class Queue_2Stack {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

         Stack<Integer> s1 = new Stack<Integer>();
         Stack<Integer> s2 = new Stack<Integer>();

        Scanner sc = new Scanner(System.in);
        int q=sc.nextInt();
        int type,x;
        while(q>0)
        {
            q--;
            type=sc.nextInt();

            //enqueue operation
            if(type==1)
            {
                x=sc.nextInt();
                //push element to stack s1
                s1.push(x);
            }

            //dequeue operation
            if(type==2)
            {
                if(s2.empty())
                {
                    //moving items from s1 to s2
                    while(!s1.empty())
                    {
                        s2.push(s1.peek());
                        s1.pop();
                    }
                }
                //popping the last element of stack-->1st element of queue
                s2.pop();
            }

            //printing last element operation
            if(type==3)
            {
                while(s2.empty())
                {
                    while(!s1.empty())
                    {
                        s2.push(s1.peek());
                        s1.pop();
                    }
                }
                //displaying last element--->1st element of s2
                System.out.println(s2.peek());
            }
        }
    }
}

