package chapter9;

/**Paul Steimel
 * Chapter 9
 * Programming Challenge 5
 *
 */

public class CourseGrades {
	
	
	//Array to hold the 4 objects
	
	private GradedActivity[] grades= new GradedActivity[4];
	
	//Method to set the lab score
	
	public void setLab(GradedActivity lab){
		
		grades[0] = lab;
		
	}
	
	//Method to set the pass/fail exam score
	
	public void setPassFailExam(PassFailExam pfExam){
		
		grades[1] = pfExam;
	}
	
	//Method to set the essay score
	
	public void setEssay(Essay essay){
		
		grades[2] = essay;
	}
	
	//Method to set the Final exam score

	public void setFinalExam(FinalExam finalExam){
		
		grades[3] = finalExam;
	}
	
	
	//Method to return a string of the stored data
	
	public String toString(){
		
		String str = "Lab Score: " + grades[0].getScore() + " Grade: " + grades[0].getGrade()
				+ "\nPass/Fail Exam Score: " + grades[1].getScore() + " Grade: " + grades[1].getGrade()
				+ "\nEssay Score: " + grades[2].getScore() + " Grade: " + grades[2].getGrade()
				+ "\nFinal Exam Score: " + grades[3].getScore() + " Grade: " + grades[3].getGrade();
		
		
		return str;
				
				
	}
	
}
