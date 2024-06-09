package ImportantStringProbs;

public class ArrayToIntValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int[] ch = {1,2,3,45,6,67,4}; 
	
StringBuilder b= new StringBuilder();
for(Integer d: ch) {
	
	b.append(d);
	
}
String intt = b.toString();
int finum = Integer.parseInt(intt);

System.out.println(finum);
	}

}
