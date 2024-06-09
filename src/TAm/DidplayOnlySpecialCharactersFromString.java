package TAm;

public class DidplayOnlySpecialCharactersFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String speciel= "sdhbvbnvbfgf^$%*&^Y*(^&*%^&*(&%^$^*&(&)^$^&^$";

speciel= speciel.replaceAll("[a-z]", "");


System.out.println(speciel);

 
	}

}
