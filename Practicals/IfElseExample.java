package corejava;

import java.util.Scanner;

public class IfElseExample 
{
	public static void main(String[] args) 
	{	//Creating a scanner class to take input from User
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		//Creating a variable using scanner class object
		int number=sc.nextInt();
		//Checking Condition
		if(number>0)
		{
			System.out.println("The Number is positive");
		}
		else if(number<0)
		{
			System.out.println("The Number is negative");
		}
		else
		{
			System.err.println("The number is zero");
		}
		sc.close();
	}
}
