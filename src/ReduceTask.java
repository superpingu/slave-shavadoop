import java.io.IOException;

/**
 * Created by arnaud on 15/06/2016.
 */
public abstract class ReduceTask {
    protected String[] data;
    protected String reduceResult = "";
    protected String filename = "";

    public ReduceTask() {}
    public ReduceTask(String filename) {
        try {
            readFile(filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readFile(String filename) throws IOException {
        this.filename = filename;
        data = Files.getLines(filename);
    }
    public void save(String filename) throws IOException {
        Files.saveString(filename, reduceResult);
    }
    public void save() throws IOException {
        save(filename+"reduced");
    }

    public abstract void reduce();
}
