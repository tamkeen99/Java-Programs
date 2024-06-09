package StringsPRoblems;

public class WordsinAsentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String sen="MY name is  dgghrgb rghrthrt rtghrthrfg tamkeen";
char[] ch=sen.toCharArray();
int count=0;
for(int i=0; i<ch.length;i++){
	

	
	
	if( i==0 && ch[i]!=' ' ||  ch[i]!=' ' && ch[i-1]==' ') {
		
		count++;
		
		
	}
	
}
System.out.println("The number of words in the sentance Are ="+count);
}
}