package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author jorge
 */
public class Kata2 {

    public static void main(String[] args) {
        int  data[] = {1,2,3,5,6,6,7,8,9,1,3,4,5,7,9,0,6,7,9,0,8,8,9,0,1};
        
        Map <Integer, Integer> histogram = new HashMap<> ();
        for (int key : data) {
           histogram.put(key, histogram.containsKey(key) ? histogram.get(key)+ 1 : 1);
        }
        Iterator < Map.Entry<Integer, Integer>> enteries= histogram.entrySet().iterator();
        while(enteries.hasNext()){
             Map.Entry<Integer , Integer > entry  = enteries.next();
             System.out.println(entry.getKey() + "==>" + histogram.get(entry.getKey()));
        }
    }

}
