
import java.util.Scanner;
class Node
{
	String string;
	int data;
	Node next;
}
class LinkedList {
Node head = null;
void insert(String string)
{
	Node node = new Node();
	node.string=string;
	node.next=null;
	if(head==null)
	{
		head=node;
	}
	else
	{
		Node n = head;
		while(n.next!=null)
			n=n.next;
		n.next=node;
	}
}
public void show()
{
	Node node = new Node();
	node = head;
	if(head!=null)
	{
		while(node.next!=null)
		{
			System.out.println(node.string);
			node = node.next;
		}
		System.out.println(node.string);
	}
}
public boolean strRepCheck(String s)
{
	Node node1 = new Node();
	node1 = head;
	if(head!=null) 
	{
		while(node1.next!=null)
		{
			if(s.contentEquals(node1.string))
				return true;
			node1 = node1.next;
		}
		if(s.contentEquals(node1.string))
			return true;
	}
	return false;
}
}
public class palSubNo {
	static LinkedList ll = new LinkedList();
	public static boolean palCheck(String s)
	{
		String ss="";
		for(int i=s.length()-1;i>=0;i--)
			ss=ss+s.charAt(i);
		if(s.contentEquals(ss))
			return true;
		else
			return false;
	}
	public static int noPal(String s)
	{
		int count=0,i;
		String ss="";
		for(int j=0;j<s.length();j++)
		{
			for(i=j;i<s.length();i++)
			{	
					ss=ss+s.charAt(i);
					if(ss.length()>1)
					if(palCheck(ss))
					{
						if(count==0)
						{
								count+=1;
								ll.insert(ss);
						}
						else if(!(ll.strRepCheck(ss)))
						{
								ll.insert(ss);
								count+=1;
						}
					}
			}
			ss="";
		}
		ll.show();
		return count;
	}
	public static void main(String Args[])
	{
		System.out.print("Enter the string");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int i = (noPal(s));
		System.out.print("Number of Palindrome substrings are"+i);
		in.close();
	}
}
