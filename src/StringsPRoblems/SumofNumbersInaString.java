package StringsPRoblems;

public class SumofNumbersInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		
		String s="yewrjfdfd23878794654767i8790857687989890890890057nvjd16d6fe3875423";
		
		
		
		int sum=0;
		
		for( int f=0; f<s.length();f++) {
			
			
			char ch=s.charAt(f);
			
			if(ch>='0' && ch<='9') {
				
				
				sum=sum+ch-48;
				
			}
			
			
			
		}
		
		System.out.println(sum);
		
		
	}

}
