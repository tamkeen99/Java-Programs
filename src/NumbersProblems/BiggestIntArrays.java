package NumbersProblems;

public class BiggestIntArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] num= {1,8,8,98,65,34,20};

int big=num[0];

for(int i=0 ;i<num.length;i++) {
	
	
	
	if(num[i]>big)
		
		big=num[i];
}

System.out.println(big);
	}

}
