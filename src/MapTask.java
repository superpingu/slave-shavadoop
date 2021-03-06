import java.io.IOException;

public abstract class MapTask {
    protected String data = "";
    protected String mapResult = "";
    protected String filename = "";

    public MapTask() {}
    public MapTask(String filename) {
        try {
            readFile(filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readFile(String filename) throws IOException {
        this.filename = filename;
        data = Files.getLines(filename)[0];
    }
    public void save(String filename) throws IOException {
        Files.saveString(filename, mapResult);
    }
    public void save() throws IOException {
        save(filename+"map");
    }

    public abstract void map();
}
