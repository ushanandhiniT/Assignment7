package Assignment7;
import java.util.*;
import java.util.stream.*;
public class StreamMax {
    public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(5,10,15,50,60,90,45,110);
            int max =  myList.stream()
                    .max(Integer::compare)
                    .get();
            System.out.println(max);
        }
    }

