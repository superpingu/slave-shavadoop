import java.util.HashSet;
import java.util.Set;

public class WordCounter extends MapTask{
    public WordCounter(String filename) {
        super(filename);
    }
    public void run() {
        String[] words = data.split(" ");
        Set<String> set = new HashSet<String>();
        mapResult = "";
        for(String word : words) {
            set.add(word);
            mapResult += word + " 1\n";
        }
        for(String key : set)
            System.out.println(key);
    }
}
