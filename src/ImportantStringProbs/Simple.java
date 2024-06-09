package ImportantStringProbs;

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int t= 0;
int r= 0;
while(t>0) {
	
	
	int digit= t%10;
	r=r+digit;
	t=t/10;
}
System.out.println(r);
	}

}
