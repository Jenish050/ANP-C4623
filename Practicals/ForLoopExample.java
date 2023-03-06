package corejava;

import java.util.Scanner;

public class ForLoopExample {

	public static void main(String[] args) 
	{
		//Creating a scanner class to take input from User
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  number of time want to print 'Happy Holi...': ");
		//Creating a variable using scanner class object
		int number=sc.nextInt();
		//Creating for loop
		for(int i=0;i<number;i++)
		{
			System.out.println("'Happy Holi...'");
		}
		sc.close();
	}

}
