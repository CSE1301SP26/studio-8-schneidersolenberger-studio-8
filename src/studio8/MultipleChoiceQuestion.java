package studio8;

import support.cse131.NotYetImplementedException;

public class MultipleChoiceQuestion extends Question {
private String[] choices;

	/**
	 * Constructor
	 * @param prompt
	 * @param answer
	 * @param points
	 * @param choices
	 */
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		super(prompt, answer, points);
		this.choices = new String[choices.length];
		return;
	}
	
	/**
	 * Display the prompt for the question in addition to 
	 * the choices present for the question.
	 */
	public void displayPrompt() {
		super.displayPrompt();
		for (int i=0; i < choices.length; i++) {
			System.out.println(i+1 + ". " + choices[i]);
		}
		return;
	}
	
	/**
	 * Getter method for the available choices
	 * @return String[] of choices
	 */
	public String[] getChoices() {
	return this.choices;
	}
	

	
	public static void main(String[] args) {
		// TODO: create your own MultipleChoiceQuestion
		MultipleChoiceQuestion sampleTwo = new MultipleChoiceQuestion ("What is 2+2?", "4", 2, new String[]{"1","2","3","4"});
		return;
	}

}
