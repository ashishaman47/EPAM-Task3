package program;
import java.io.*;

public class LinkedList {
	
	Node head=null;
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	public static LinkedList insert(LinkedList list,int data)
	{
		Node new_node = new Node(data);
		new_node.next=null;
		
		if(list.head==null)
		{
			list.head=new_node;
		}
		else
		{
			Node currNode = list.head;
			while(currNode.next != null)
			{
				currNode=currNode.next;
			}
			currNode.next=new_node;
		}
		return list;
	}
	
	public static void mid_element(LinkedList list)
	{
		Node n = list.head;
		int x=0,y=0;
		while(n!=null)
		{
			x++;
			n=n.next;
		}
		
		x=(x/2)+1;
		n=list.head;
		while(n.next!=null)
		{
			y++;
			if(y==x)
			{
				y--;
				System.out.println("Index "+y+" is the middle element "+n.data);
				break;
			}
			n=n.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list=new LinkedList();
		
		for(int i=1;i<=9;i++)
		{
			list=insert(list,i);
		}
		
		mid_element(list);
		

	}

}
