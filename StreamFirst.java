package Assignment7;
import java.util.*;
import java.util.stream.*;
public class StreamFirst {
        public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(20,30,40,50);
            myList.stream()
                    .findFirst()
                    .ifPresent(System.out::println);
        }
    }

