
import java.time.*;
import java.time.format.DateTimeFormatter;
  
public class DateTimeWithNoTimeZone {
 
public static void LocalDateTimeApi()
{
  
    //current date
    LocalDate date = LocalDate.now();
    System.out.println("current date : "+date);
  
  
    // the current time
    LocalTime time = LocalTime.now();
    System.out.println("current time : "+time);
      
  
    // the current time with date
    LocalDateTime current = LocalDateTime.now();
    System.out.println("current date and time : "+current);
  
  
    // in a particular format
    DateTimeFormatter format =DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 
    String formatedDateTime = current.format(format); 
    System.out.println("dd-MM-yyyy HH:mm:ss "+formatedDateTime);
    DateTimeFormatter format2 =DateTimeFormatter.ofPattern("MM-dd-yyyy HH:ss:mm"); 
    String formatedDateTime2 = current.format(format2); 
    System.out.println("MM-dd-yyyy HH:ss:mm "+formatedDateTime2);
  
  
    // printing months days and seconds
    Month month = current.getMonth();
    int day = current.getDayOfMonth();
    int seconds = current.getMinute();
    System.out.println("Month : "+month+" day : "+day+" seconds : "+seconds);
  
    // printing some specified date
    LocalDate date2 = LocalDate.of(1947,8,15);
    System.out.println("Republic day :"+date2);
  
    // printing date with current time.
    LocalDateTime specificDate =current.withDayOfMonth(05).withMonth(10).withYear(1998);
     System.out.println("specific date with current time : "+specificDate);
}
 
 
    public static void main(String[] args)
    {
        LocalDateTimeApi();
    }
}