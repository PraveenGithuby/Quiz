package Question;

import java.util.ArrayList;

public class ListOfQuestion 
{
	public ArrayList<QuestionDTO> DotNet = new ArrayList<QuestionDTO>();
	public ArrayList<QuestionDTO> Java = new ArrayList<QuestionDTO>();
	public ArrayList<QuestionDTO> SQL = new ArrayList<QuestionDTO>();
	public ArrayList<QuestionDTO> Python = new ArrayList<QuestionDTO>();
	
	public void addPython(QuestionDTO dto)
	{
		Python.add(dto);
	}
	public ArrayList<QuestionDTO> PythonQuestion() 
	{
		return Python;
	}
	
	
	
	public void addJava(QuestionDTO dto)
	{
		Java.add(dto);
	}
	public ArrayList<QuestionDTO> JavaQuestion()
	{
		return Java;
	}
	
	
	public void addSQL(QuestionDTO dto)
	{
		SQL.add(dto);
	}
	public ArrayList<QuestionDTO> SQLQuestion()
	{
		return SQL;
	}
	
	
	
	public void addDotNet(QuestionDTO dto)
	{
		DotNet.add(dto);
	}
	public ArrayList<QuestionDTO> DotNetQuestions()
	{
		return DotNet;
	}
	
}
