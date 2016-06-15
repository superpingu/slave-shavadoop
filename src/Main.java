import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        if(args.length > 1) {
            if(args[0].equals("map")) {
                MapTask mapper = new WordCounter(args[1]);
                mapper.map();
                mapper.save();
            } else if(args[0].equals("shuffle")) {
                String result = Shuffle.shuffle(args[1], args);
                Files.saveString(args[args.length-1], result);
            } else if(args[0].equals("reduce")) {
                ReduceTask reducer = new WordReducer(args[1]);
                reducer.reduce();
                reducer.save();
            }
        } else {
            System.err.println("usage : java -jar slave-shavadoop.jar map <input file>");
            System.err.println("usage : java -jar slave-shavadoop.jar shuffle <key> <input files ...> <output file>");
            System.err.println("usage : java -jar slave-shavadoop.jar reduce <input file>");
        }
    }
}

