import java.util.Map;
import java.util.*;
import java.util.HashMap;
public class Countfreq{
    public static void main(String[] args){
        int[] arr = {1,32,21,3,1,4};
        Map<Integer,Integer> count = new HashMap<>();
        for(int i : arr){
           if(count.containsKey(i)){
               int initialFreq = count.get(i);
               count.put(i,initialFreq + 1);
           }
           else{
               count.put(i,1);
           }
       }
       for(int i : count.keySet()){
           System.out.println(i + " ki freq hai:"+count.get(i));
       }

    }
}