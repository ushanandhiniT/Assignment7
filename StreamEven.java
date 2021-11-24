package Assignment7;
import java.util.*;
import java.util.stream.*;
public class StreamEven {
    public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(4,16,32,40,10,15,8,49,25,98,32);
            myList.stream()
                    .filter(n -> n%2 == 0)
                    .forEach(System.out::println);
        }
    }

