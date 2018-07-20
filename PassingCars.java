package javatest;

import java.util.Scanner;

public class PassingCars {
	public static int solution(int[] A) {
		int zeros = 0, count = 0;
		for (int i = 0; i < A.length; i++)
		{
			if (A[i] == 0) zeros++;                    
            if (A[i] == 1) count += zeros;    
            if (count > 1000000000) 
            	return -1;
        }
        return count;
	}
	
	public static void main (String args[])
    {
    	Scanner reader = new Scanner(System.in);
    	int[] number = new int[5]; 
		for ( int i = 0; i < number.length; i++) 
		{ 
			System.out.println("Enter a number: "); 
			number[i] = reader.nextInt();
			}
		int result = PassingCars.solution(number);
		System.out.println("result is" + result);
		}
	}