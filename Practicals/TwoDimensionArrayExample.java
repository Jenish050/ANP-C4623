package Arrays;

import java.util.Scanner;

public class TwoDimensionArrayExample 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//Get the dimension of the array from the user
		System.out.println("Enter the number of Rows: ");
		int Rows = sc.nextInt();
		System.out.println("Enter the number of Columns: ");
		int Columns = sc.nextInt();
		//Create the array with the user specified dimension
		int[][] array = new int[Rows][Columns];
		//Get the values for the array from the user
		System.out.println("Enter the values for array: ");
		for(int i=0;i<Rows;i++)
		{
			for(int j=0;j<Columns; j++)
			{
				System.out.printf("Enter the value for elements (%d,%d):",i,j);
				array[i][j]=sc.nextInt();			}
		}
		//Print Output of the array
		System.out.println("The Array is: ");
		for(int i=0;i<Rows;i++)
		{
			for(int j=0;j<Columns; j++)
			{
				System.out.print(array[i][j]+" ");
			}				
			System.out.println();
			
		}
	}

}
