package ex12;

public class 가변인자 {

	public static void main(String[] args) {

		 String[] strArr = {"100", "200", "300"};
		 
		 //System.out.println(concatenate(",", "100", "200", "300"));
		 System.out.println(concatenate(",", "5", "10", "20"));
		 
	}
    //static String concatenate(String delim, String str, String... args) {
    	static String concatenate(String delim, int... args) {
    	
    	//System.out.println(delim +" | " + str + " | " +args );
    	System.out.println(delim + " | " +args );
    	
//    	for(String s : args)
//    		 System.out.println(s);

    	
    	for(String s : int)
    		System.out.println(s);
    	return null;
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
	
}
