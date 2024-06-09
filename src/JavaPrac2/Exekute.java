package JavaPrac2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class Exekute {

public static void main( String[] ars) {
	
	String s= "tamkeen";
	
	String x= "Ameen";
	
	
	s=s.concat(x)
	;
	x=s.substring(0,s.length()-x.length());
	s=s.substring(x.length());
	
	System.out.println(s);
	System.out.println(x);
		
}
}

	


	

		
