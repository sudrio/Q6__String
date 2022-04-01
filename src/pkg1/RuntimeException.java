  package pkg1;

public class RuntimeException {
 
	public static void main(String[] args) 
	{
		// Exception handled by try and catch method.
		
		int a =10;
		int b =0;
		
		int[] k= {1,2,3,4,5};
		
		
		try 
		{
		 int c= a/b;
		 System.out.println(c);
		 System.out.println(k[5]);
		 }
		catch(ArithmeticException e)
		    {
			//System.out.println("Exception handled");
			System.out.println(e);
		    }
		catch(ArrayIndexOutOfBoundsException w)
		{
			 System.out.println(k[5]);
			System.out.println(w);
		}
    System.out.println("Program finished");
	}

}
