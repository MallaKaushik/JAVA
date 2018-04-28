import java.util.Scanner;

class acc {
	String n[]=new String[20],an[]=new String[20],C[]=new String[20],t[]=new String[20];
	int b[]=new int[20],c,i=0;
	Scanner Sc=new Scanner(System.in);
	void get()
	{
		while(i!=1)
		{
			
		
		System.out.print("enter the acc number : ");
		an[i]=Sc.nextLine();
		System.out.print("enter the name of holder : ");
		n[i]=Sc.nextLine();
		int it=0;
		
		while(it!=1)
		{
			System.out.print("enter the type of account : ");
			t[i]=Sc.nextLine();
			if(t[i].compareTo("credit")==0)
			{
				System.out.println("your acc type is credit card ");
				it=1;
			}
			else
			{
				if(t[i].compareTo("debit")==0)
				{
				System.out.println("your acc type is debit card ");
				it=1;
				}
				else
				{
					System.out.print("enter the correct type of acc : ");
					t[i]=Sc.nextLine();
				}
			}
		}
		System.out.print("enter the balance in your acc : ");
		b[i]=Sc.nextInt();
		Sc.nextLine();
		int it1=0;
		while(it1!=1)
		{
			System.out.println("enter do you want withdraw amt=wt or \ndeposit amt=dt or \ncheck the balance=bal : ");
			C[i]=Sc.nextLine();
			if(C[i].compareTo("wt")==0)
			{
				System.out.print("enter the amt do you want withdraw from your acc :");
				c=Sc.nextInt();
				Sc.nextLine();
				if(b[i]>=c)
				{
					b[i] =b[i]-c;
					System.out.println("your current balance is : "+b[i]);
					it1=1;
				}
				else
				{
					System.out.println("you did not have sufficient : "+b[i]);
					System.out.println("please try again !!!....");
					c=Sc.nextInt();
					Sc.nextLine();
				}
			}
			else
			{
				if(C[i].compareTo("dt")==0)
				{
					System.out.println("enter the amt do you want deposit but not greater than 10,000 :");
					c=Sc.nextInt();
					Sc.nextLine();
					if(c<=10000)
					{
						b[i]=b[i]+c;
						System.out.println("your current balance is : "+b[i]);
						it1=1;
						break;
					}
					else {
						System.out.println("please try again!!!.....");
						System.out.println("enter the amt below 10,000 = ");
						c=Sc.nextInt();
						Sc.nextLine();
					}
				}
			}
			if(C[i].compareTo("bal")==0)
			{
				System.out.println("your current balance is : "+b[i]);
				it1=1;
				break;
			}
			else {
				System.out.println("enter the correct choice  : ");
				C[i]=Sc.nextLine();
			}
		}
		i=1;
	}
}
	void put()
	{
		System.out.println("name of holder\tacc number\ttype of card\tbalance\n");
		for(int i=0;i<1;i++)
		{
			System.out.println(n[i]+"\t\t"+an[i]+"\t\t"+t[i]+"\t\t"+b[i]);
		}
	}
			
}
public class Bank {

	public static void main(String[] args) {
		acc obj=new acc();
		obj.get();
		obj.put();

	}

}
