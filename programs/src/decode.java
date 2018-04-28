import java.util.Scanner;

public class decode {

	public static void main(String[] args) {
		int i=0,j = 0,k1=0,z=0,a=0,b=0,code,d1,d2,d3,d4,d5,d6,k = 0,num = 0,vcode[]={0,1,2,3,4,5,6,7,8,9},vcode1[]={0,1,2,3,4,5,6,7,8,9},vcode2[]={0,1,2,3,4,5,6,7,8,9},vcode3[]={0,1,2,3,4,5,6,7,8,9},vcode4[]={0,1,2,3,4,5,6,7,8,9},vcode5[]={0,1,2,3,4,5,6,7,8,9},vcode6[]={0,1,2,3,4,5,6,7,8,9};
		Scanner sc=new Scanner(System.in);
		System.out.print("do you want enter four digit  code or six digit code : ");
	    int num1=sc.nextInt();
	    if(num1==4)
	    {
		System.out.print("Set the digit code : ");
		code=sc.nextInt();
		sc.nextLine();
		d4=code%10;
		code=code/10;
		d3=code%10;
		code=code/10;
		d2=code%10;
		code=code/10;
		d1=code%10;
		code=code/10;
		for(i=0;i<10;i++)
		{
			if(vcode[i]==d1)
			{
				System.out.println("the first digit of code is : "+vcode[i]);
				num++;
			for(j=0;j<10;j++)
			{
				if(vcode1[j]==d2)
				{
					System.out.println("the second digit of code is : "+vcode1[j]);
					num++;
				for(k1=0;k1<10;k1++)
				{
					if(vcode2[k1]==d3)
					{
						System.out.println("the thrid digit of code is : "+vcode2[k1]);
						num++;
					for(z=0;z<10;z++) 
					{
						if(vcode3[z]==d4)
						{
							System.out.println("the fourth digit of code is : "+vcode3[z]);
							k=1;
							System.out.println("the total code is : "+vcode[i]+""+vcode1[j]+""+vcode2[k1]+""+vcode3[z]);
							num=i+j+k1+z+4;
						}
					}
					}
				}
				}
			}
			}
		}
	    }
		 if(num1==6)
		    {
			System.out.print("Set the digit code : ");
			code=sc.nextInt();
			sc.nextLine();
			d6=code%10;
			code=code/10;
			d5=code%10;
			code=code/10;
			d4=code%10;
			code=code/10;
			d3=code%10;
			code=code/10;
			d2=code%10;
			code=code/10;
			d1=code%10;
			code=code/10;
			for(i=0;i<10;i++)
			{
				if(vcode[i]==d1)
				{
					System.out.println("the first digit of code is : "+vcode[i]);
					
				for(j=0;j<10;j++)
				{
					if(vcode1[j]==d2)
					{
						System.out.println("the second digit of code is : "+vcode1[j]);
						
					for(k1=0;k1<10;k1++)
					{
						if(vcode2[k1]==d3)
						{
							System.out.println("the thrid digit of code is : "+vcode2[k1]);
							
						for(z=0;z<10;z++) 
						{
							if(vcode3[z]==d4)
							{
								System.out.println("the fourth digit of code is : "+vcode3[z]);
								
								for(a=0;a<10;a++)
								{
									if(vcode4[a]==d5)
									{
										System.out.println("the fifth digit of code is : "+vcode4[a]);
										for(b=0;b<10;b++)
										{
											if(vcode5[b]==d6)
											{
												System.out.println("the sixth digit of code is : "+vcode5[b]);
												k=1;
												num=i+j+k1+z+a+b+6;
												System.out.println("the total code is : "+vcode[i]+""+vcode1[j]+""+vcode2[k1]+""+vcode3[z]+""+vcode4[a]+""+vcode5[b]);
											}
										}
									}
										
								}
							}
						}
						}
					}
					}
				}
				}
			}
		    }
		if(k==1)
		{
			System.out.println("therefore the system carcked the code  !!");
		}
		else
		{
			System.out.println("the system failed in carcking the code !!");
		}
		System.out.println("the no of trails : "+num);
    }

}