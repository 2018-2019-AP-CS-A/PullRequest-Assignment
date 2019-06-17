/**
 * @author Ethan Karczewski //include this tag in your classes with your name
 * 
 * Assignment Instructions:
 * 	- Right click on the src folder and create a new package.
 * 	- Name the package "lastName_firstName", replacing lastName with your last name and firstName with your first name.
 * 	- Inside that package, create a new class "Exercises".
 *    - YOU SHOULD ONLY BE MAKING CHANGES IN THIS PACKAGE
 * 	- Create a javadoc comment at the top with the '@author' tag with your name next to it (do this for all classes you create)
 * 	- Create the following static methods:
 * 		- int threeAndFive() : Returns the sum of all the multiples of 3 or 5 below 1000
 * 		- int evenFibSum() : Returns the sum of the even-valued terms less than 4 million in the Fibonacci Sequence
 * 		- int largestPrimeFactor() : Returns the largest prime factor of the number 600851475143
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
package karczewski_ethan;
import java.lang.Object;
import java.lang.Number;
import java.math.BigInteger;

public class Exercises 
{
	public int threeAndFive()
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
	
	public int evenFibSum()
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
	
	public int largestPrimeFactor()
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