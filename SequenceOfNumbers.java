package javatest;

import java.util.Scanner;

public class SequenceOfNumbers { 
	public static boolean TrueFalse(int[] nums) { 
		boolean result = false; 
		for(int i=0; i < nums.length-2; i++){ 
			if (nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3){ 
				result = true; 
				break;
				}
			}
		return result;
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int[] number = new int[5]; 
		for ( int i = 0; i < number.length; i++) { 
			System.out.println("Enter a number: "); 
			number[i] = sc.nextInt();
			} 
		boolean result = SequenceOfNumbers.TrueFalse(number);
		System.out.println("result is" + result);
		}
}
