import java.util.*;
import java.util.stream.*;
  
public class Stream {
  public static void main(String args[])
  {
  
    // create a list of integers
    List<Integer> number = Arrays.asList(2,3,4,5);
    System.out.println("LIST :"+number);
    // demonstration of map method
    List<Integer> square = number.stream().map(x -> x*x).
                           collect(Collectors.toList());
    System.out.println(" NEW LIST :" +square);
  
    // create a list of String
    List<String> names =
                Arrays.asList("Deepti","Smriti","Akriti");
    System.out.println("NAME LIST :"+names);
    // demonstration of filter method
    List<String> result = names.stream().filter(s->s.startsWith("S")).
                          collect(Collectors.toList());
    System.out.println(" NAME STARTING WITH 'S' :"+ result);
  
    // demonstration of sorted method
    List<String> show =
            names.stream().sorted().collect(Collectors.toList());
    System.out.println(" SORTED NAME LIST :"+show);
  
    // create a list of integers
    List<Integer> numbers = Arrays.asList(2,3,4,5,2);
  
    // collect method returns a set
    Set<Integer> squareSet =
         numbers.stream().map(x->x*x).collect(Collectors.toSet());
    System.out.println(squareSet);
  
    // demonstration of forEach method
    number.stream().map(x->x*x).forEach(y->System.out.println(y));
  
    // demonstration of reduce method
    int even =
       number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
  
    System.out.println(even);
  }
}



