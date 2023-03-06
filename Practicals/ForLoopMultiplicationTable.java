package corejava;

import java.util.Scanner;

public class ForLoopMultiplicationTable {

	public static void main(String[] args) {
		//Creating Scanner
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		//Creating Variable
		int num = sc.nextInt();
		//Creating for loop
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"x"+i+"="+(num*i));
		}
	}

}
