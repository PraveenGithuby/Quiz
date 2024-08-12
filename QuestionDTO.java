package Question;

public class QuestionDTO 
{
	String Question;
	String option_A;
	String option_B;
	String option_C;
	String option_D;
	AnswerDTO answer;
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public String getOption_A() {
		return option_A;
	}
	public void setOption_A(String option_A) {
		this.option_A = option_A;
	}
	public String getOption_B() {
		return option_B;
	}
	public void setOption_B(String option_B) {
		this.option_B = option_B;
	}
	public String getOption_C() {
		return option_C;
	}
	public void setOption_C(String option_C) {
		this.option_C = option_C;
	}
	public String getOption_D() {
		return option_D;
	}
	public void setOption_D(String option_D) {
		this.option_D = option_D;
	}
	public AnswerDTO getAnswer() {
		return answer;
	}
	public void setAnswer(AnswerDTO answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question" + "\n" +Question + "\n" +  "A: " + option_A +"\n"+ "B: " + option_B +"\n"+ "C: "
				+ option_C + "\n"+"D: " + option_D;
	}
	
}
