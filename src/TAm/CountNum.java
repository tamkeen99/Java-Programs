package TAm;

public class CountNum {

	public static void main(String[] args) {
	
		int num=64547864;
		
		int numcount=0;
		while(num>0) {
			
			numcount++;
			
			
			num=num/10;
			
		}
		System.out.println(numcount);

	}

}
