package Question;

public class QuestionDAO 
{
	QuestionDTO dto;
	public QuestionDTO saveQuestion(String Question, String Option_A, String Option_B, String Option_C, String Option_D, String finalAnswer)
	{
		QuestionDTO question = new QuestionDTO();
		question.setQuestion(Question);
		question.setOption_A(Option_A);
		question.setOption_B(Option_B);
		question.setOption_C(Option_C);
		question.setOption_D(Option_D);
		
		AnswerDTO answer = new AnswerDTO();
		answer.setAnswer(finalAnswer);
		
		question.setAnswer(answer);
		this.dto = question;
		return dto;
	}
	
	public QuestionDTO retriveQuestion(QuestionDTO dto)
	{
		return dto;
	}
	
	public boolean answer(QuestionDTO dto, String ans)
	{
		String answer = dto.getAnswer().toString();
		if(answer.equals(ans))
			return true;
		return false;
	}
	
}
