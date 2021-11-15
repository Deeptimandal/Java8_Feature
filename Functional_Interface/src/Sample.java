//functional interface(contains only one abstract method)
interface Message1{  
    void statement1(String msg);  
} 
//functional interface(contains only one abstract method and multiple non-abstract method )
interface Message2{  
    void statement2(String msg);  
    default void show1()
    {
      System.out.println("Default Method Executed inside functional interface");
    }
    static void show2()
    {
      System.out.println("static Method Executed inside functional interface");
    }
} 
//functional interface(with multiple methods of object class)
@FunctionalInterface
interface Message3{  
    void statement3(String msg); 
    int hashCode();  
    String toString();  
    boolean equals(Object obj);  
    }


public class Sample implements Message2, Message3{  
	@Override
	public void statement2(String msg) {
		System.out.println(msg);
	}
	@Override
	public void statement3(String msg) {
		System.out.println(msg);
	}
	
	
    public static void main(String[] args) {  
       Message1 m =(String msg)->System.out.println(msg); 
       m.statement1("I am abstract method from funtional interface1 with only one abstract method");
       
       Sample s= new Sample();
       s.statement2("I am abstract method from funtional interface2 with only one abstract method and other non-abstract method");
       s.show1();
       Message2.show2();
       s.statement3("I am abstract method from funtional interface3 with only one abstract method and multiple Object class method");
    }
	
		
}




