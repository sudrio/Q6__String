package pkg1;

public class CompiletimeException {

	public static void main(String[] args) throws InterruptedException 
	{
		
	// with the help of throws keyword we can handle Compile time Exception.
		
		for(int i=0 ;i<5; i++)
		{
			System.out.println(i);
			Thread.sleep(2000);    //2000 Milliseconds is equals to 2 Seconds.
		}

	}

}
