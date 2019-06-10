/**
 * @author Matthew Perkins
 */
package Perkins_Matthew;

public class Exercises
{
	public static int threeAndFive()
	{
		int sum = 0;
		for(int i = 0; i < 1000; i++)
		{
			if(i % 5 == 0 || i % 3 == 0)
				sum = i + sum;
		}
		return sum;
	}

	public static int evenFibSum()
	{
		int sum = 0, i = 1;
		while(fibHelp(i) < 4000000)
		{
			if(fibHelp(i)%2 == 0)
				sum = sum + fibHelp(i);
			i++;
		}
		return sum;
	}

	private static int fibHelp(int n)
	{
		if(n <= 2)
			return 1;
		else
			return fibHelp(n-1) + fibHelp(n-2);
	}

	public static int largestPrimeFactor()
	{
		long num = 600851475143L;
		boolean isPrime = true;

		// this is to see if num is factorable
		for (int i = 2; i < num; i++) 
		{
			//if i is a factor, check if its prime
			if (num % i == 0) 
			{
				for (int j = 2; j < i; j++) 
				{
					if (i % j == 0) 
					{
						isPrime = false;
					}
				}
				if (isPrime) 
				{
					return i;
				}
			}
		return (int) num;
		}
	}
}

