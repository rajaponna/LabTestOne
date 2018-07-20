package javatest;

import java.util.Scanner;

public class PermutationCheck {
	public static int solution(int[] A) {
		int[] counter = new int [A.length];
		for(int i= 0; i< A.length; i++)
		{
			if (A[i] < 1 || A[i] > A.length) 
			{
				return 0;
				}
			else if(counter[A[i]-1] == 1) 
			{
				return 0;
				}
			else 
			{
				counter[A[i]-1] = 1;
				}
	        }
	        return 1;
	    }
	
	public static void main(String[] args)
	{
    	Scanner reader = new Scanner(System.in);
    	int[] number = new int[3]; 
		for ( int i = 0; i < number.length; i++) 
		{ 
			System.out.println("Enter a number: "); 
			number[i] = reader.nextInt();
			}
		int result = PermutationCheck.solution(number);
		System.out.println("result is" + result);
    }
}
