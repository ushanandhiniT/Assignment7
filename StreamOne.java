package Assignment7;
import java.util.*;
import java.util.stream.*;
public class StreamOne {
        public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(10,21,13,51,16,19,20,50);
            myList.stream()
                    .map(s -> s + "")
                    .filter(s -> s.startsWith("1"))
                    .forEach(System.out::println);
        }
}
