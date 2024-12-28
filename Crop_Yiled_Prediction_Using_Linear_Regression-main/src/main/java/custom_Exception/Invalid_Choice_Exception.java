package custom_Exception;

public class Invalid_Choice_Exception extends RuntimeException{

	String message;
	public Invalid_Choice_Exception(String message)
	{
		this.message=message;
		
	}
	public String getInvalidChoiceMessage()
	{
		return message;
	}
}
