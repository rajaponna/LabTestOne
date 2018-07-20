package javatest;

public class ScoreUp {
	public static int scoreUp(String[] key, String[] answers) 
	{
		int score= 0;
		for (int i=0; i<key.length; i++)
		{
			if(answers[i]=="?"){
				score+=0;
				}
			else if(key[i]== answers[i])
			{
				score+=4;	
			}
			else
			{
				score--;
			}
		}
	return score;
	}
	
	public static void main(String args[])
	{
		//String[][] result = ScoreUp.scoreUp({"a","a","b","b"},{"a","c","b","c"});
		//System.out.println("result is:" + Intger.parseInt(result));
	}

}
