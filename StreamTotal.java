package Assignment7;
import java.util.*;
import java.util.stream.*;
public class StreamTotal {
        public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(5,10,15,20,25,30,35,40,45,50);
            long count =  myList.stream()
                    .count();
            System.out.println(count);
        }
    }

