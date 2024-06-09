package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemovingDuplicateNumAndSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] s= {1,6,98,5,5,5,5,5,5,64,54,34,5,64,4};

Set<Integer>al=new HashSet<Integer>();


for(int i=0;i<s.length;i++) {
	
	al.add(s[i]);
	}

System.out.print(" After Removing Repeated number-----");
for(Integer c: al) {
	
	System.out.print(  " "+c+" ");
}
System.out.println();
List<Integer>a=new ArrayList<Integer>(al);  //here we are converting to List b/c fot Set we cant soft so we have to convert it to List.

Collections.sort(a);
System.out.print(" After Removing Repeated number and after sorting ------");

for(Integer c: a) {
	
	System.out.print(c+" ");
}

	}

}
