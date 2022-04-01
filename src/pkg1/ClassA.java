package pkg1;

public class ClassA {

	public static void main(String[] args) 
   {
	// String using new keyword
		
		String a = new String("Rio");
		String b = new String("Rio");
		
		// String without using new keyword
		
		String c = "rio";
		String d = "Rio";
		
		System.out.println(c==d);
		System.out.println(a==b);   
		System.out.println(c==a);    //comparing address
		System.out.println(c==b);
		System.out.println(b==d);
		System.out.println(a==d);
		
		System.out.println("===================================");
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(b.equals(a));  //comparing Data
		System.out.println(b.equals(d));
		System.out.println(c.equals(d));
	
	}
}
