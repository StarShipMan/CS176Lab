
public class Quiz implements Measurable{
	private String name;
	private double score;
	
	public Quiz(String inName,int inScore) {
		name = inName;
		score = inScore;
	}//Constructor for Quiz
	
	public double getMeasure() {
		return score;
	}//geMeasure method implemented from Measurable
	
}//class Quiz
