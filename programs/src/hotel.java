import java.util.Scanner;

class h
{
	protected String n;
	protected int t;
	Scanner Sc =new Scanner(System.in);
	public void h()
	{
		System.out.print("enter the hotel do you want to enter : ");
		n=Sc.nextLine();
		this.n=n;
		System.out.print("Avaliable room types are \n 1.single room \n2.double room\n3.suite room\n");
		
	}
}
class h1 extends h{
	public void print()
	{
		
		super.h();
	
	System.out.print("enter the type of rooms do you want to enter : ");
	int i=0;
	while(i!=1)
	{
		
		t=Sc.nextInt();
		if (t==1)
		{
			System.out.println("hotel is "+n);
			System.out.println("the room u have seleceted was single room\nthe room cost is 200 ");
			System.out.println("!!!THANK YOU VISTING !!!!");
			i=1;
			break;
		}
		else {
			if(t==2)
			{
				System.out.println("hotel is "+n);
				System.out.println("The room u have selected was double room\nthe room cost is 300 ");
				System.out.println("!!!THANK YOU VISTING !!!!");
				i=1;
				break;
			}
			else
			{
				if(t==3)
				{
					System.out.println("hotel is "+n);
				System.out.println("The room u have selected was suite room\nthe room cost is 500 ");
				System.out.println("!!!THANK YOU VISTING !!!!");
				i=1;
				break;
				}
				else
				{
					System.out.print("wrong choice !!\nplease enter type of room again :");
					t=Sc.nextInt();
				}
			}
		}
	}
}
}
public class hotel {
	public static void main(String [] args)
	{
		
		h1 obj=new h1();
		obj.print();
		
	}
}
