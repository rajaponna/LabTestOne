	package javatest;

public class RepeatString {
	
	public static String repeatFront(String string, int n)
	{
		String result = string.substring(0,n);
		for(int i=1;i<n;i++) {
			result=result+string.substring(0,n-i);
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		String result = RepeatString.repeatFront("Chocolate", 5);
		System.out.println("result is"+ result);
		
	}

}
