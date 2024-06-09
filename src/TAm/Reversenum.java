package TAm;

public class Reversenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=345677;
int reverse= 0;
  while (num>0) {
	  
	  
	  int digit = num%10;
	  
	  reverse= reverse*10 + digit;
	  
	  num=num/10;
  }
  
  
  System.out.println(reverse); 
  
	
	}

}
