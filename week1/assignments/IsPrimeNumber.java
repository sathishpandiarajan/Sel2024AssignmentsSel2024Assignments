package week1.assignments;

import java.util.Iterator;

public class IsPrimeNumber 
{
	public static void main(String args[])
	{
		int num = 11, flag = 0;
		
		if(num == 0 || num == 1)
		{
			System.out.println(num + " is a non-prime number.");
		}
		else
		{
			
			for (int i = 2; i <= num/2; i++)
			{
				// if (num % i == 0 || num % num == 0)
				if (num % i == 0)
				{
					System.out.println(num + " is a non-prime number.");
					flag = 1;
					break;
				}
			}
			
			if (flag == 0)
			{
				System.out.println(num + " is a prime number.");
				//break;
			}
		}
	}
}
