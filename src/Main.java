import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        if(args.length > 0) {
            MapTask mapper = new WordCounter(args[0]);
            mapper.run();
            mapper.saveMap();
        } else
            System.err.println("usage : java -jar slave-shavadoop.jar <input file>");
    }
}
