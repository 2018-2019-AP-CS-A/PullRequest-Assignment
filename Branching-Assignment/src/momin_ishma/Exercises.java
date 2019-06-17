/**
 * @author Ishma Momin //include this tag in your classes with your name
 * 
 * 
 * 	- Create a separate Driver class and test your program by outputting the answers to your static methods
 *
 * Submission Instructions:
 *  - Save your saved work on Eclipse - your workspace should be the file location of the cloned repo
 *  - In GitHub Desktop, add your summary and commit your changes
 *  - Then push your commits to GitHub
 *  - Go to your repo on GitHub.com
 *  - Click "New pull request"
 *  - Click "Create pull request"
 *  - In the summary for your request, put your first and last name
 *  - Send the request
 * 
 * 
 */

package momin_ishma;

public class Exercises 
{
	public static int threeAndFive()
	{
		int sum = 0;
		for (int i = 0; i < 1000; i = i + 3)
		{
			sum += i;
		}
		for (int i = 0; i < 1000; i = i + 5)
		{
			if (i % 3 != 0)
			{
				sum += i;
			}
		}
		return sum;
	}

	public static int evenFibSum()
	{
		int sum = 1;
		int temp = 0;
		for (int i = 1; i < 4000000; i += temp)
		{
			temp = i;
			if (i % 2 == 0)
			{
				sum += i;
			}
		}
		return sum;
	}



	public static int largestPrimeFactor()
	{
		long largest = 600851475143L;
		long factor = 2;
		while(largest > factor)
		{
			if(largest % factor == 0)
			{
				largest = largest/factor;
				factor = 2;
			}
			else
				factor++;
		}
		return (int)largest;
	}
}
