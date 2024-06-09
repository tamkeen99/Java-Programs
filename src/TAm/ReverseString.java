package TAm;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "tamkeen";
		
		String v= "";
		
		
		for( int t=0; t<s.length();t++) {
			
			
			char ch = s.charAt(t);
			
			
			v= ch+v;
			
			
		}
		System.out.println(v);
		
		
		
	}

}
