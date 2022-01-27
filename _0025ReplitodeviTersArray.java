package _00Replit;

public class _0025ReplitodeviTersArray {

	public static void main(String[] args) {	

		    	// Write a return method to reverse number.

		 		// Input : 12345

		 		// Output : 54321		
		
        String str = "12345";
           
        System.out.println(tersineCevir(str));
	}

	public static String tersineCevir(String str) {
		String tersStr="";
		
		for (int i = str.length()-1; i >=0; i--) {			
			
			tersStr+=str.substring(i, i+1);			
		}		
		return tersStr;
	}
}
