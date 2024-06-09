package ImportantStringProbs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumINAssending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,2,3,3,4,5,5,5,53,3,4,5,5};
		
		for(int i=0; i<a.length;i++) {
			
			for(int j=i+1; j<a.length;j++) {
				
				if(a[i]>a[j]) {
					
					a[i]=a[j]-a[i]+(a[j]=a[i]);
				}
				
			}

		}
		for(int e: a) {
			
			System.out.print(e+" ");
		}
		
		Set<Integer>d=new HashSet<Integer>();
		
		for(int f: a) {
			
			d.add(f);
		}
		System.out.println();
		System.out.println("After sorting");
		for(int x : d) {
			
			System.out.print(x+" ");
		}
		
	}

}
