package chapter10;

/**Paul Steimel
 * Chapter 10
 * Programming Challenge 1
 *
 */

public class TestScores {
	
	private double[] scoreArray;
	
	//Constructor that accepts an array of test scores as an argument
	
	public TestScores(double[] scores){
		
		scoreArray = scores;
		int count = 0;
		
		while(count < scoreArray.length){
			
			if(scoreArray[count] < 0 || scoreArray[count] > 100){
				throw new IllegalArgumentException("Element: " + count + " Score: " + scoreArray[count]);
			}
			
			count++;
		}
		
	}
	
	//Method that returns the average of the test scores
	
	public double getAverage(){
		
		int i=0;
		double sum = 0;
		
		while(i < scoreArray.length){
			

			sum = sum + scoreArray[i];
			i++;
			
		}
		
		double average = sum / scoreArray.length;
		
		return average;
	}

}
