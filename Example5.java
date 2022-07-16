interface SampleInterface{
	
	int UPPER_LIMIT = 100;
	
	//int LOWER_LIMIT; // Error - must be initialised
	
}

public class Example5 implements SampleInterface{

	public static void main(String[] args) {
		
		System.out.println("UPPER LIMIT = " + UPPER_LIMIT);
		
		// UPPER_LIMIT = 150; // Can not be modified
	}

}