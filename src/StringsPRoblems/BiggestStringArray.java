package StringsPRoblems;

public class BiggestStringArray {
	
	public static void main(String[] args) {
	String[] words= {"tamkeen","farooqhnks","moinuddinsaab","ameen"};
	
	String b=words[0];
	
	
	for(int i=0; i<words.length;i++) {
		
		if(words[i].length()>b.length()) {
			
			b=words[i];
		}
	}
	
System.out.println(b);
}
}