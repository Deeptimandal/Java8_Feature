//referring constructor with the help of functional interface.
interface IntMessage{  
    Message getMessage(String msg);  
}  
class Message{  
    Message(String msg){  
        System.out.print(msg);  
    }  
}  
public class Constructor_Reference {  
    public static void main(String[] args) {  
        IntMessage im = Message::new;  
        im.getMessage("I am constructor reffered by functional interface");  
    }  
}  

