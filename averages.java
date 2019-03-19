import java.util.*;
import java.math.*;
class averages
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];int sum =0;
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++)
		{
			sum +=a[i]; 
		}
		sum = sum/n;
		System.out.println(sum);
	}
}	
