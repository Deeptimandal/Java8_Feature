import java.util.function.BiFunction;

//referring a static method to it's functional method
interface Reference1{  
    void say();  
} 


//predefined functional interface to refer methods
class Arithmetic{  
public static int add(int a, int b){  
return a+b;  
}  
//overriding static methods by referring methods.
public static float add(int a, float b){  
return a+b;  
}  

}  
public class Static_Reference {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method reffering to functional method.");  
    }  
    public static void main(String[] args) {  
        // Referring static method  
    	Reference1 r1 = Static_Reference::saySomething;  
        // Calling interface method  
        r1.say();
        
        BiFunction<Integer, Integer, Integer>adder = Arithmetic::add;  
        int result1 = adder.apply(10, 20);  
        System.out.println(result1);
        BiFunction<Integer, Float, Float>adder2 = Arithmetic::add; 
        float result2 = adder2.apply(10, 20.7f);  
        System.out.println(result2);
    }  
}  
