package ImportantStringProbs;

public class OccurranceOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="My nam is tamkeen";
		
		int count=0;
		for (int i=0; i<str.length();i++) {
			
			if(str.charAt(i)=='e') {
				
				count++;
			}
		}
System.out.println(count);
	}

}
