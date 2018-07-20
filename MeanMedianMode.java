package javatest;

import java.util.*;

public class MeanMedianMode { 
	public static int findMean(int arr[]) {
		int sum = 0;
		int avg=0;
		int length=arr.length;
		for(int j = 0; j < length; j++)
		{
			sum += arr[j];
			avg = sum / length;
		}
		return avg;
	} 
	
	public static int findMedian(int arr[]) {
		int length=arr.length;
		int[] sort = new int[length];
		System.arraycopy(arr, 0, sort, 0, sort.length);
		Arrays.sort(sort);
		if (length % 2 == 0) { 
			return (sort[(sort.length / 2) - 1] + sort[sort.length / 2]) / 2; 
			} 
		else { 
			return sort[sort.length / 2]; 
			} 
	}

public static int findMode(int array[]) { 
	int max=0, maxCount=0; 
	int length=array.length; 
	for (int i = 0; i <length; ++i) { 
		int count = 0; 
		for (int j = 0; j <length; ++j) { 
			if (array[j] == array[i]) ++count; 
			} 
		if (count > maxCount) 
		{ 
			maxCount = count; 
			max = array[i]; 
			}
		} 
	return max; 
	} 

public static void main(String[] args) { 
	Scanner sc = new Scanner(System.in); 
	int[] number = new int[5]; 
	for ( int i = 0; i < number.length; i++) { 
		System.out.println("Enter a number: ");
		number[i] = sc.nextInt(); 
		} 
	int mean=MeanMedianMode.findMean(number); 
	System.out.println("Mean= "+mean); 
	int median=MeanMedianMode.findMedian(number); 
	System.out.println("Median= "+median); 
	int mode=MeanMedianMode.findMode(number); 
	System.out.println("Mode= "+mode);
	} 
}

