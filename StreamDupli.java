package Assignment7;
import java.util.*;
import java.util.stream.*;
public class StreamDupli {
        public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(15,20,25,30,35,15,40,20,45,30,50);
            Set<Integer> set = new HashSet();
            myList.stream()
                    .filter(n -> !set.add(n))
                    .forEach(System.out::println);
        }
    }

