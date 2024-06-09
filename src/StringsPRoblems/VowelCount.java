package StringsPRoblems;

public class VowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		 String name="bananaTamkeen";
		 
		 
		 String lower= name.toLowerCase();
		 
		 
	
		 
		 
		 int vcount = 0; 
		 int count=0;
		 for ( int i=0; i< lower.length(); i++)
		 {
			 
			 char ch=lower.charAt(i);
			 if( ch=='a'|| ch=='e' || ch=='i' || ch=='0' ||  ch=='u') {
				 
				 vcount++;
			 }
			 
			 else 
				 count++;
		 }
		System.out.println(     "the number of vowels are "+vcount);
		System.out.println( "The number of consonants are "+count);
		
	}

}
