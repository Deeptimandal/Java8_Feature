import java.util.*;

public class Foreach {

	public static void main(String[] args) {
		
		  List<String> family=new ArrayList<String>();  
	        family.add("Mom");  
	        family.add("Dad");  
	        family.add("Grandmaa");  
	        family.add("Me");  
	          
	        family.forEach(  
	            (n)->System.out.println(n)  
	        );  
	}

}
