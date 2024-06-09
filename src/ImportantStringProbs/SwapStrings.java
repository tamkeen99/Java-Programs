package ImportantStringProbs;

public class SwapStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "tamkeen";
		String b= "kashif";
		
	System.out.println("Before Swap  s=="  +s );
	System.out.println("Before Swap  b=="  +b );
	
	
	 System.out.println();
	 System.out.println();
	 
	 
	 s=s.concat(b);
	 
	 b=s.substring(0,s.length()-b.length());
	 
	 s=s.substring(b.length());
	 
	 System.out.println("After Swap  s=="  +s );
		System.out.println(" After Swap  b=="  +b );
	}

}
