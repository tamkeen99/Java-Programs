package StringsPRoblems;

public class CapitalToSmallToCapitol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	String str="Alain is a good girl";
	
	
	
	char[] ch=str.toCharArray();
	
	
	for(int i=0; i<ch.length; i++) {
		
		if(i==ch.length-1  &&  ch[i]!=' ' || ch[i]!=' ' && ch[i+1]==' ') {
			
			
			if(ch[i]>'a'  && ch[i]<'z')
				
				ch[i]= (char)(ch[i]-32);
		}
		
		else if(ch[i]>'A'  && ch[i]<'Z')
				
				ch[i]= (char)(ch[i]+32);
		
	}
	
	str=new String(ch);
	System.out.println(str);
	}

}
