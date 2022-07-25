package work;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain1 {
    public static void main(String[] args) {
        //create a list and Filter all even numbers
        List<Integer>list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(list);
        List<Integer>evenList=list.stream().filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println(evenList);
    }
}
