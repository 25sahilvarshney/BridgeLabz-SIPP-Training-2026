import java.util.HashSet;
import java.util.*;
public class removeduplicates{
    public static void main(String[] args){
        int[] arr = {1,32,21,1,4,1};
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }
        System.out.println(set);
    }
}
