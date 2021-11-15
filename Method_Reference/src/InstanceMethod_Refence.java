interface Statement{  
    void msg(String msg);  
}  
public class InstanceMethod_Refence {  
    public void message(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
    	InstanceMethod_Refence mr = new InstanceMethod_Refence(); // Creating object  
        // Referring non-static method using reference  
        	Statement s = mr::message;  
        // Calling interface method  
            s.msg("i am non-static method reffered by class object");  
        // Referring non-static method using anonymous object  
            Statement s2 = new InstanceMethod_Refence()::message; // You can use anonymous object also  
        // Calling interface method  
            s2.msg("i am non-static method reffered by anonymous object");  
    }  
}  
