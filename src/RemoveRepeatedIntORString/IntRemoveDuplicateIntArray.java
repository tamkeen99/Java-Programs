package RemoveRepeatedIntORString;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntRemoveDuplicateIntArray {
public static void main(String[] args) {
int[] num= {2,4,4,56,6,7,77,7,78,3,3,35,5,67,8,89,564,33,2};

Set<Integer>s=new HashSet<Integer>();

for(int i: num ) {
	
	s.add(i);
}

Integer[] numw= s.toArray(new Integer[s.size()]);


for(int d : numw) {
	
	System.out.print(d+" ");
}
}
}
