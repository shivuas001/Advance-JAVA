package advJAVA;


//To create our own custom Exception we create a class of it and constructor and class should extend the parent Exception class
//string because from custom Exception we sending a string message so we call super class to handle.

class ShivaKumarException extends Exception
{
	public ShivaKumarException(String string)
	{
		super(string);
	}
}

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int i = 20;
		int j = 0;
        
        try
        {
        	j=18/i;
        	if(j==0)
        	throw new ShivaKumarException("i dont want to print Zero");
        }

        catch(ShivaKumarException e)
        {
        	System.out.println("your dividing by zero" + e);
        }
        
        
        catch(Exception e)
        {
        	System.out.println("something went wrong" +  e);
        }
         
        System.out.println(j);
        System.out.print("hello");
        
	}

}
