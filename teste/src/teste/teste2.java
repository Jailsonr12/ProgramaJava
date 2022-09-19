package teste;

public class teste2 {
	
	 public static String MathChallenge(String str) {
		    Integer str2 = Integer.parseInt(str, 2);
		    String Binatio = Integer.toString(str2);

		    return Binatio;
		  }
	 	
		  public static void main (String[] args) {  
		    // keep this function call here     
		    //Scanner s = new Scanner(System.in);
		    System.out.print(MathChallenge("0110")); 
		  }
}