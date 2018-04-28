import java.util.Scanner;

public class sort {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in); 
		int a[]=new int[10],b[]=new int[10],c[]=new int[20],k,n;
		System.out.print("Enter the number do you want : ");
		k=Sc.nextInt();
		Sc.nextLine();
		for(int i=0;i<k;i++) {
			a[i]=Sc.nextInt();
			Sc.nextLine();
			
		}
		System.out.print("Enter the number do you want : ");
		n=Sc.nextInt();
		Sc.nextLine();
		for(int i=0;i<n;i++) {
			b[i]=Sc.nextInt();
			Sc.nextLine();
			
		}
        int s=0;
        int temp;
        for(int i=0;i<k;i++) {
        	for(int j=0;j<n;j++) {
        		if(a[i]<a[j])
        		{
        		temp=a[i];
        		a[i]=a[j];
        		a[j]=temp;
        		}
        	}
        }
        for(int i=0;i<k;i++) {
        	for(int j=0;j<n;j++) {
        		if(b[i]<b[j])
        		{
        		temp=b[i];
        		b[i]=b[j];
        		b[j]=temp;
        		}
        	}
        }
        int pos = 0;
        for(int i=0;i<k;i++) {
        	
        
        for(int j=0;j<k;j++) {
        	if(a[i]<a[j]) {
        		if(s==0)
        		{
        	 	c[s]=a[i];
        	 	s++;
        		}
        		else {
        			
            	 	c[s]=a[i];
            	 	s++;
            	 	pos=s;
        		}
        	 	
        	}
        	else {
        		if(s==0)
        		{
        	 	c[s]=a[j];
        	 	s++;
        		}
        		else {
        			
            	 	c[s]=a[j];
            	 	s++;
            	 	pos=s;
            	 	
        		}
        	}
        	
        }
        }
        for(int i=0;i<n;i++) {
        	
            
            for(int j=0;j<n;j++) {
            	if(b[i]<b[j]) {
            		if(s==0)
            		{
            	 	c[pos]=b[i];
            	 	pos++;
            		}
            		else {
            			
                	 	c[pos]=b[i];
                	 	pos++;
                	 	
            		}
            	 	
            	}
            	else {
            		if(s==0)
            		{
            	 	c[pos]=b[j];
            	 	pos++;
            		}
            		else {
            			
                	 	c[pos]=b[j];
                	 	pos++;
                	 	
            		}
            	}
            	
            }
            }
        for(int i=0;i<s+pos;i++) {
        	System.out.println(c[i]);
        }
}
}
