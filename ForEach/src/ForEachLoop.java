import java.util.*;   

public class ForEachLoop {  
	
    public static void main(String[] args) {  
    	
        List<String> employee = new ArrayList<String>();  
        employee.add("Deepti");  
        employee.add("Mehnash");  
        employee.add("Saswata");  
        employee.add("Abhisekh");  
        
        System.out.println("------------Iterating by passing lambda expression--------------");  
        employee.forEach(emp -> System.out.println(emp));  
        
        System.out.println("------------Iterating by passing method reference---------------");  
        employee.forEach(System.out::println);  
    }  
          
   
}  

