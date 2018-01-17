package by.htp.flowers.logic;

import by.htp.flowers.bean.Flower;

public class FortuneTeller {
	
	private String question;
	private String[] answer;
	
	public FortuneTeller(String question, String[] answer) {
		
		this.question = question;
		this.answer = answer;
		
	}
	
		public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String[] getAnswer() {
		return answer;
	}

	public void setAnswer(String[] answer) {
		this.answer = answer;
	}

	public void tellTheTruth(Flower flower) {
		
		int k = ((flower.getBud().getLeaves().length) % (answer.length));
		
		if ((question != null) && (answer != null)) {
			if ((flower.getBud().getLeaves().length) < answer.length) {
				System.out.println("Question: " + getQuestion() +"The answer: " + getAnswer()[(flower.getBud().getLeaves().length -1)]);
							} else {
								
							
			if (k > 0) {
				System.out.println("Question: " + getQuestion() +"The answer: " + getAnswer()[k-1]);
							}
			if (k == 0) {
				System.out.println("Question: " + getQuestion() +"The answer: " + getAnswer()[k]);
							}
			if ((flower.getBud().getLeaves().length) < answer.length) {
				System.out.println("Question: " + getQuestion() +"The answer: " + getAnswer()[(flower.getBud().getLeaves().length -1)]);
							}
		}
		
		} else
			System.out.println("No leaves.");
	
		}
	
}
