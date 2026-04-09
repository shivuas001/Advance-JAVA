package advJAVA;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int i = 2;
		int j = 0;

        int[] nums = new int[5];
        
        String s = null;
        
        try
        {
        	j=18/i;
        	System.out.println(s.length());
        	System.out.println(nums[5]);
        }
 //multiple catch block can be writen to handle different types exception.  
        catch(ArrayIndexOutOfBoundsException e)
        {
        	System.out.println("your exceding ur limit");
        }
        catch(ArithmeticException e)
        {
        	System.out.println("your dividing by zero");
        }
        
    //Exception is an parent class where it can handle all types of exception and always it should be bottom.
        
        catch(Exception e)
        {
        	System.out.println("something went wrong" +  e);
        }
        
        
        System.out.println(j);
        System.out.print("hello");
        
	}

}
