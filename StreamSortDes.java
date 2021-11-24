package Assignment7;
import java.util.*;
import java.util.stream.*;
import java.util.function.Function;
public class StreamSortDes {
        public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(5,10,40,50,20,10,60,15,80,15);

            myList.stream()
                    .sorted(Collections.reverseOrder())
                    .forEach(System.out::println);
        }
    }
