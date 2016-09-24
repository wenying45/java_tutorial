package advanced;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author ying.wen
 */
public class WordCounter {
    private static <K, V> Map<K, V> sortByValue(Map<K, V> map) {
        List<Entry<K, V>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Object>() {
            @SuppressWarnings("unchecked")
            public int compare(Object o1, Object o2) {
                return -((Comparable<V>) ((Map.Entry<K, V>) (o1)).getValue()).compareTo(((Map.Entry<K, V>) (o2)).getValue());
            }
        });

        Map<K, V> result = new LinkedHashMap<>();
        for (Iterator<Entry<K, V>> it = list.iterator(); it.hasNext();) {
            Map.Entry<K, V> entry = (Map.Entry<K, V>) it.next();
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }
    
    public static void main(String[] args) throws IOException{
        File file = new File("pg11.txt");
        Map<String, Integer> wordTable = new HashMap<String, Integer>();
        try(Scanner sc = new Scanner(new FileInputStream(file))){
            while(sc.hasNext()){
                String word = sc.next();
                Integer count = wordTable.getOrDefault(word,0);
                wordTable.put(word, count + 1);
            }
        }
        Map<String, Integer> sortedwordTable = WordCounter.sortByValue(wordTable);
        
        for(String word : sortedwordTable.keySet()) {
            System.out.println(word+": "+wordTable.get(word));
        }
        
    }
}
