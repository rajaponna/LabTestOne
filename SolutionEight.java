package javatest;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class SolutionEight {
	static TreeMap<Integer,Object> all = new TreeMap<Integer,Object>();

    public static int solution(int[] Arr) {

        for(int i=0; i<Arr.length; i++)
            all.put(i+1,new Object());

        for(int i=0; i<Arr.length; i++)
            if(all.containsKey(Arr[i]))
                all.remove(Arr[i]);

        Iterator<Integer> notOccur = all.keySet().iterator();
        if(notOccur.hasNext())
            return (int)notOccur.next();
        return 1;
    }
    
    public static void main (String args[])
    {
    	Scanner reader = new Scanner(System.in);
    	int[] number = new int[6]; 
		for ( int i = 0; i < number.length; i++) { 
			System.out.println("Enter a number: "); 
			number[i] = reader.nextInt();
			}
		int result = SolutionEight.solution(number);
		System.out.println("result is" + result);
    }
}

