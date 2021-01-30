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
        
        String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
        
        Histogram histogra = new Histogram(data);
        Map<String,Integer> histogrm = histogra.getHistogram();
        
        histogrm.keySet().forEach(key -> {
            System.out.println(key + " --> " + histogrm.get(key));
        });
    }
}
