package TAm;

public class RomoveSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String mani="yfsfisgbfhsdvbf$#^&^&*(^*$*&&(^$^&%(*%JBNBHVJHXVXCBG*&$$%^&%#$^$^$HJBAVXJHGZCFCJKZGHC*$@E@@*E&)QE";


String replce= mani.replaceAll("[^a-zA-Z]", "");


System.out.println(replce);

	}

}
