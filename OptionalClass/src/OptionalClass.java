import java.util.Optional;  

public class OptionalClass{  
    public static void main(String[] args) {  
        String[] fruits ={"apple","banana","orange","grapes","mango"} ;
        //no null pointer exception
        Optional<String> nullcheck = Optional.ofNullable(fruits[3]);  
        if (nullcheck.isPresent()) {  
            String fruit  = fruits[3].toUpperCase();  
            System.out.println(fruit);  
        } else  
            System.out.println("string in index not present.");  
        
        //avoiding null pointer exception
        String[] list = new String[10];  
        Optional<String> checkNull = Optional.ofNullable(list[5]);  
        if(checkNull.isPresent()){
            String word = list[5].toLowerCase();  
            System.out.print(word);  
        }else  
            System.out.println("string value is not present");  
      
	}  
    
}
