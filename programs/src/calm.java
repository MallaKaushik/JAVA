import java.io.*;
	import java.io.IOException;

public class calm {
	

	public static void main(String[] args)throws IOException {


				try
				{

					int k=0;
					double a,b=0,c=0,p=0;
					String str1;
					DataInputStream in =new DataInputStream(System.in);
					System.out.print("enter a number to be ");
					a= Integer.parseInt(in.readLine());
					while(true)
					{
						System.out.println("created by kaushik.m");
					System.out.println("add for add \nsub for sub \nmul for mul\ndiv for division\nmod for mod\npre for precentage\nAns for ans\nCls for clear\nExt for exit");
					System.out.println("enter your choice : ");
					
					str1=in.readLine();
						System.out.print("enter do you want add another number (1 or 0): ");
					k= Integer.parseInt(in.readLine());
			
					if(k==1)
					{

						b= Integer.parseInt(in.readLine());	
					}
								
					switch(str1)
					{
					case "add":
						
						if(c==0)
						{
							c=a+b;
						}
						else 
						{
							c +=b;
						}
						break;
					case "sub":
						if(c==0)
						{
							c=a-b;
							
						}
						else 
						{
							c=c-b;
						} 
						break;
					case "mul":
						if(c==0)
						{
							c=a*b;
							
						}
						else 
						{
							c=c*b;
						}
						break;
					case "div":
						if(c==0)
						{
							c=a/b;
							
						}
						else 
						{
							c=c/b;
						}
						break;
					case "mod":
						if(c==0)
						{
							double f=a%b;
							System.out.println("do you want to add or sub the remiander \n enter 1 for add to total\nenter 2 for sub from the total\nenter 0 for leave the total : ");
							int w=Integer.parseInt(in.readLine());
							if(w==1)
							{
								c=c+f;
							}
							if(w==2)
							{
								c=c-f;
							}
						}
						else 
						{
							double f=c%b;
							System.out.println("do you want to add or sub the remiander \n enter 1 for add to total\nenter 2 for sub from the total\nenter 0 for leave the total : ");
							int w=Integer.parseInt(in.readLine());
							if(w==1)
							{
								c=c+f;
							}
							if(w==2)
							{
								c=c-f;
							}
							
						}
						break;
					case "pre":
						if(c==0)
						{
							p=(a/100)*b;
							c=a;
							System.out.println("for "+c+"the precentage is : "+p);
							c=c-p;
						}
						else 
						{
							p=(c/100)*b;
							System.out.println("for "+c+"the precentage is : "+p);
							c=c-p;
						}
						break;
					case "Ans":
						if(c==0)
						{
							System.out.println("answer is zero");
							
						}
						else 
						{
							System.out.println("therefore the total is : "+c);
						}
						break;
					case "Cls":
						a=0;
						b=0;
						c=0;
						System.out.println("the values assgined to zeroes ");
						break;
					case "Ext":
						System.exit(0);
						break;
					}
					}
					}catch(IOException e) {
					System.out.print(e.getMessage());
				}
				

		}
		}
