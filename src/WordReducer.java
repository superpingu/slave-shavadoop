
public class WordReducer extends ReduceTask {
    public WordReducer(String filename) {
        super(filename);
    }

    @Override
    public void reduce() {
        reduceResult = data[0].split(" ")[0] + " " + data.length;
    }
}
