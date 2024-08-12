package Question;

import java.util.Scanner;

public class MainProgram 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		
		QuestionDAO dao = new QuestionDAO();
		ListOfQuestion list = new ListOfQuestion();
		
		QuestionDTO question1 = dao.saveQuestion("What is JAVA", "PL", "ML", "VR", "AI", "PL");
		QuestionDTO question2 = dao.saveQuestion("What is JAVA1", "PL", "ML", "VR", "AI", "PL");
		list.addJava(question1);
		list.addJava(question2);
		
		QuestionDTO question3 = dao.saveQuestion("What is SQL", "PL", "ML", "VR", "AI", "PL");
		QuestionDTO question4 = dao.saveQuestion("What is SQL1", "PL", "ML", "VR", "AI", "PL");
		list.addSQL(question3);
		list.addSQL(question4);
		
		QuestionDTO question5 = dao.saveQuestion("What is Python", "PL", "ML", "VR", "AI", "PL");
		QuestionDTO question6 = dao.saveQuestion("What is Python1", "PL", "ML", "VR", "AI", "PL");
		list.addPython(question5);
		list.addPython(question6);
		
		QuestionDTO question7 = dao.saveQuestion("What is DotNet", "PL", "ML", "VR", "AI", "PL");
		QuestionDTO question8 = dao.saveQuestion("What is DotNet1", "PL", "ML", "VR", "AI", "PL");
		list.addDotNet(question7);
		list.addDotNet(question8);
		
	
		
		//System.out.println((list.DotNetQuestions()));
		
		// To get DotNet Question
		for (QuestionDTO question : list.DotNetQuestions()) 
		{
			System.out.println(question);
			String ans = sc.nextLine();
			System.out.println("--------------------------------------------");
			if(dao.answer(question, ans))
				System.out.println("Correct Answer");
			else
				System.out.println("Wrong Answer");
			System.out.println("--------------------------------------------");
		}
		
				
				sc.close();
	}
}
