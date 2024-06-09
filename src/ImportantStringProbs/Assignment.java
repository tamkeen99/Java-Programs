package ImportantStringProbs;

public class Assignment {

	
		static String str="";
		public static void main(String[] args) {
			
			z:
			
			for(int x=2; x<10; x++) {
				
				if(x==3) continue;
				if(x==5) break z;
				str=str+x;
			}
			
			System.out.println(str);
		}
	}


