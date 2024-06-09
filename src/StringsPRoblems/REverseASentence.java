package StringsPRoblems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class REverseASentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
String met="My name is Tamken and iam not a terririst";


String[] words = met.split(" ");

List<String> l = Arrays.asList(words);


    Collections.reverse(l);


for(String word: words) {
	
	System.out.print(word+" ");
	
	
}
//System.out.println(list.get(3));

}
}