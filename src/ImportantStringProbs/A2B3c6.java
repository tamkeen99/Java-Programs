package ImportantStringProbs;

public class A2B3c6 {

	public static void main(String[] args) {
		String s="a5n8h4";

		StringBuilder sb= new StringBuilder();
		 for(int i=0; i<s.length(); i+=2){
		   
		   char ch= s.charAt(i);
		   int r= Character.getNumericValue(s.charAt(i+1));
		 
		   for(int j=0; j<r; j++){
		     
		     sb.append(ch);
		     
		   }
		   
		   
		   
		 }
		   System.out.println(sb);	
	}

}
