import java.io.*;

class Guvi
{
    public static void main(String args[])throws IOException
    { 

	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	
	String str,str1;

	System.out.println("Enter the first string");
	str=in.readLine();
	
	System.out.println("Enter the second string");
	str1=in.readLine();
			
	int c=0,l1,l2,i,j;
	
	char ch,ch1,ch2;
	
	l1=str.length();
	l2=str1.length();


	
	for(i=0,j=0;i<Math.min(l1,l2);i++,j++)
	{
		ch1=str.charAt(i);
		ch2=str1.charAt(j);
	
		c=ch1-ch2;
		
		if(c!=0)
			break;
		
		if(l1<l2)
			c=-1;
		else if(l1>l2)
			c=1;		
			
		
	}
	
	if(c<0)
		System.out.println(str1);
	else if(c==0)
		System.out.println(str1);
	else
		System.out.println(str);
		

    } 
} 
