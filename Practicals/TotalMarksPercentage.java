package Arrays;

import java.util.Scanner;

public class TotalMarksPercentage 
{

	public static void main(String[] args) 
	{	//Creating Scanner Object  
		Scanner sc=new Scanner(System.in);
		int arr[] = new int[5];
		int i=0;
		int totalMarks =0;
		
		//For Loop
		System.out.println("Enter Marks of 5 Subject: ");
		for(i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
			totalMarks += arr[i];
			
		}

		System.out.println("The Total Marks are : " +totalMarks);
		float percentage= ((float)totalMarks/50)*100;
		System.out.println("Percentage is:"+percentage+"%");
	}

}
