//Write a Java program that prompts the user to enter their age and then determines whether they are eligible to vote or not. The program should print a message saying whether the user is eligible to vote or not based on their age.
package corejava;

import java.util.Scanner;

public class IfElseVote 
{

	public static void main(String[] args) 
	{
		//Creating Scanner Class Object
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Age: ");
		//Creating variable 
		int age=sc.nextInt();
		//If Else
		if(age>=18)
		{
			System.out.println("Your eligible to Vote");
		}
		else
		{
			System.out.println("Your are not eligible to vote");
		}
		sc.close();
	}

}
