import java.io.*;
import java.util.*;
import java.lang.*;
class Grocery
{
	int N,sid,rem,lnum=0,k,key=0,pos,i;
	int id[]=new int[20];
	int qty[]=new int[20];
	double fprice[]=new double[20];
	double sprice[]=new double[20];
	double small,disc;
	String iname[]=new String[20];
	char ch;
	Scanner sc=new Scanner(System.in);
	void read()
	{
		System.out.println("enter student id  :");
		sid=sc.nextInt();
		while(sid>0)
		{
			rem=sid%10;
			sid=sid/10;
			if(rem>lnum)
			{
				lnum=rem;
			}
		}
		N=lnum;
		
		for(i=0;i<N;i++)
		{
			sc.nextLine();
			System.out.println("enter item name  :");
			iname[i]=sc.nextLine();
			System.out.println("enter item id from 1 to 333  :");
			id[i]=sc.nextInt();
			while(id[i]>333)
			{
				System.out.println("wrong id entered enter the id again  :");
				id[i]=sc.nextInt();
			}
			System.out.println("enter item quantity in stock  :");
			qty[i]=sc.nextInt();
			System.out.println("enter item factory price  :");
			fprice[i]=sc.nextDouble();
			while(fprice[i]>1000.0)
			{
				System.out.println("wrong price entered,enter again  :");
				fprice[i]=sc.nextDouble();
			}
			
		}
	}
	void shopprice()
	{
		System.out.println("enter discount percentage  :");
		disc=sc.nextDouble();
		for(i=0;i<N;i++)
		{
			sprice[i]=fprice[i]-((disc/100.0)*fprice[i]);
		}
	}
	void display()
	{
		System.out.println("item name \t itemID \t quantity \t factory price \t shop price");
		for(i=0;i<N;i++)
		{
			System.out.println(iname[i]+"\t\t"+id[i]+"\t\t"+qty[i]+"\t\t"+fprice[i]+"\t\t"+sprice[i]);
	    }
	}
	
	
}
class shop extends Grocery{
	void sell()
	{
		System.out.println("enter item id to sell  :");
		k=sc.nextInt();
		for(i=0;i<N;i++)
		{
			if(k==id[i])
			{
				key=1;
				if(qty[i]!=0)
				{
					System.out.println("item sold");
					qty[i]=qty[i]-1;
				}
				else
				{
					System.out.println("out of stock");
				}
			}
		}
		if(key!=1)
		{
			System.out.println("entered wrong id number,repeat the menu again");
		}
	}
	
	void lowestprice()
	{
		small=fprice[0];
		for(i=0;i<N;i++)
		{
			if(small>fprice[i])
			{
				small=fprice[i];
				pos=i;
			}
		}
		System.out.println(iname[pos]+"\t"+id[pos]+"\t"+qty[pos]+"\t"+fprice[pos]+"\t"+sprice[pos]);
	}
	
}
class shop1 extends shop{
	void sortdisplay()
	{
		for(i=0;i<N;i++)
		{
			ch=iname[i].charAt(0);
			if(ch=='a')
				System.out.println(iname[i]+"\t"+id[i]+"\t"+qty[i]+"\t"+fprice[i]+"\t"+sprice[i]);
		}
		for(i=0;i<N;i++)
		{
			ch=iname[i].charAt(0);
			if(ch=='b')
				System.out.println(iname[i]+"\t"+id[i]+"\t"+qty[i]+"\t"+fprice[i]+"\t"+sprice[i]);
		}
		for(i=0;i<N;i++)
		{
			ch=iname[i].charAt(0);
			if(ch=='c')
				System.out.println(iname[i]+"\t"+id[i]+"\t"+qty[i]+"\t"+fprice[i]+"\t"+sprice[i]);
		}
		for(i=0;i<N;i++)
		{
			ch=iname[i].charAt(0);
			if(ch=='d')
				System.out.println(iname[i]+"\t"+id[i]+"\t"+qty[i]+"\t"+fprice[i]+"\t"+sprice[i]);
		}
		for(i=0;i<N;i++)
		{
			ch=iname[i].charAt(0);
			if(ch=='e')
				System.out.println(iname[i]+"\t"+id[i]+"\t"+qty[i]+"\t"+fprice[i]+"\t"+sprice[i]);
		}
		for(i=0;i<N;i++)
		{
			ch=iname[i].charAt(0);
			if(ch=='f')
				System.out.println(iname[i]+"\t"+id[i]+"\t"+qty[i]+"\t"+fprice[i]+"\t"+sprice[i]);
		}
		for(i=0;i<N;i++)
		{
			ch=iname[i].charAt(0);
			if(ch=='g')
				System.out.println(iname[i]+"\t"+id[i]+"\t"+qty[i]+"\t"+fprice[i]+"\t"+sprice[i]);
		}
		for(i=0;i<N;i++)
		{
			ch=iname[i].charAt(0);
			if(ch=='h')
				System.out.println(iname[i]+"\t"+id[i]+"\t"+qty[i]+"\t"+fprice[i]+"\t"+sprice[i]);
		}
		for(i=0;i<N;i++)
		{
			ch=iname[i].charAt(0);
			if(ch=='i')
				System.out.println(iname[i]+"\t"+id[i]+"\t"+qty[i]+"\t"+fprice[i]+"\t"+sprice[i]);
		}
		for(i=0;i<N;i++)
		{
			ch=iname[i].charAt(0);
			if(ch=='j')
				System.out.println(iname[i]+"\t"+id[i]+"\t"+qty[i]+"\t"+fprice[i]+"\t"+sprice[i]);
		}
		for(i=0;i<N;i++)
		{
			ch=iname[i].charAt(0);
			if(ch=='k')
				System.out.println(iname[i]+"\t"+id[i]+"\t"+qty[i]+"\t"+fprice[i]+"\t"+sprice[i]);
		}
		for(i=0;i<N;i++)
		{
			ch=iname[i].charAt(0);
			if(ch=='l')
				System.out.println(iname[i]+"\t"+id[i]+"\t"+qty[i]+"\t"+fprice[i]+"\t"+sprice[i]);
		}
                for(i=0;i<N;i++)
		{
			ch=iname[i].charAt(0);
			if(ch=='m')
				System.out.println(iname[i]+"\t"+id[i]+"\t"+qty[i]+"\t"+fprice[i]+"\t"+sprice[i]);
		}
		for(i=0;i<N;i++)
		{
			ch=iname[i].charAt(0);
			if(ch=='n')
				System.out.println(iname[i]+"\t"+id[i]+"\t"+qty[i]+"\t"+fprice[i]+"\t"+sprice[i]);
		}
		for(i=0;i<N;i++)
		{
			ch=iname[i].charAt(0);
			if(ch=='o')
				System.out.println(iname[i]+"\t"+id[i]+"\t"+qty[i]+"\t"+fprice[i]+"\t"+sprice[i]);
		}
		for(i=0;i<N;i++)
		{
			ch=iname[i].charAt(0);
			if(ch=='p')
				System.out.println(iname[i]+"\t"+id[i]+"\t"+qty[i]+"\t"+fprice[i]+"\t"+sprice[i]);
		}
		for(i=0;i<N;i++)
		{
			ch=iname[i].charAt(0);
			if(ch=='q')
				System.out.println(iname[i]+"\t"+id[i]+"\t"+qty[i]+"\t"+fprice[i]+"\t"+sprice[i]);
		}
		for(i=0;i<N;i++)
		{
			ch=iname[i].charAt(0);
			if(ch=='r')
				System.out.println(iname[i]+"\t"+id[i]+"\t"+qty[i]+"\t"+fprice[i]+"\t"+sprice[i]);
		}
		for(i=0;i<N;i++)
		{
			ch=iname[i].charAt(0);
			if(ch=='s')
				System.out.println(iname[i]+"\t"+id[i]+"\t"+qty[i]+"\t"+fprice[i]+"\t"+sprice[i]);
		}
		for(i=0;i<N;i++)
		{
			ch=iname[i].charAt(0);
			if(ch=='t')
				System.out.println(iname[i]+"\t"+id[i]+"\t"+qty[i]+"\t"+fprice[i]+"\t"+sprice[i]);
		}
		for(i=0;i<N;i++)
		{
			ch=iname[i].charAt(0);
			if(ch=='u')
				System.out.println(iname[i]+"\t"+id[i]+"\t"+qty[i]+"\t"+fprice[i]+"\t"+sprice[i]);
		}
		for(i=0;i<N;i++)
		{
			ch=iname[i].charAt(0);
			if(ch=='v')
				System.out.println(iname[i]+"\t"+id[i]+"\t"+qty[i]+"\t"+fprice[i]+"\t"+sprice[i]);
		}
		for(i=0;i<N;i++)
		{
			ch=iname[i].charAt(0);
			if(ch=='w')
				System.out.println(iname[i]+"\t"+id[i]+"\t"+qty[i]+"\t"+fprice[i]+"\t"+sprice[i]);
		}
		for(i=0;i<N;i++)
		{
			ch=iname[i].charAt(0);
			if(ch=='x')
				System.out.println(iname[i]+"\t"+id[i]+"\t"+qty[i]+"\t"+fprice[i]+"\t"+sprice[i]);
		}
		for(i=0;i<N;i++)
		{
			ch=iname[i].charAt(0);
			if(ch=='y')
				System.out.println(iname[i]+"\t"+id[i]+"\t"+qty[i]+"\t"+fprice[i]+"\t"+sprice[i]);
		}
		for(i=0;i<N;i++)
		{
			ch=iname[i].charAt(0);
			if(ch=='z')
				System.out.println(iname[i]+"\t"+id[i]+"\t"+qty[i]+"\t"+fprice[i]+"\t"+sprice[i]);
		}	
	}
}
public class Groceryshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice,it=0;
		shop1 obj=new shop1();
		while(it!=1)
		{
			System.out.println("1.read validate store all items");
			System.out.println("2.calculate shop price for all items");
			System.out.println("3.display");
			System.out.println("4.sell");
			System.out.println("5.display least price item");
			System.out.println("6.sort&display");
			System.out.println("7.exit");
			System.out.println("enter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				obj.read();
				break;
			case 2:
				obj.shopprice();
				break;
			case 3:
				obj.display();
				break;
			case 4:
				obj.sell();
				break;
			case 5:
				obj.lowestprice();
				break;
			case 6:
				obj.sortdisplay();
				break;
			case 7:
				it=1;;
				break;
			default:
				System.out.println("wrong choice");
				break;	
			}
			
			
		}
		
	}

}
