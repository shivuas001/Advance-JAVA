package advJAVA;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int i = 20;
		int j = 0;
        
        try
        {
        	j=18/i;
       //here we are trying to create an exception by using throw keyword.
       //here 18/20 will gives zero and catch block does not execute so we only create exception by throw keyword.
        	if(j==0)
        	throw new ArithmeticException();
        }

        catch(ArithmeticException e)
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
