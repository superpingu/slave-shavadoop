import java.io.IOException;

public class Shuffle {
    static String findKey(String key, String file) throws IOException {
        String[] lines = Files.getLines(file);
        String result = "";
        for(String line : lines) {
            if(line.split(" ")[0].equals(key))
                result += line + "\n";
        }
        return result;
    }
    public static String shuffle(String key, String[] files) throws IOException {
        String result = "";
        for(int i=2; i<files.length-1; i++)
            result += findKey(key, files[i]);
        return result;
    }
}
