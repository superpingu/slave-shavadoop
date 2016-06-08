import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public abstract class MapTask {
    protected String data = "";
    protected String mapResult = "";
    protected String filename = "";

    public MapTask() {}
    public MapTask(String filename) {
        try {
            readFile(filename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void readFile(String filename) throws FileNotFoundException {
        this.filename = filename;
        data = new Scanner(new FileReader(filename)).nextLine();
    }
    public void saveMap(String filename) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(filename);
        out.print(mapResult);
        out.close();
    }
    public void saveMap() throws FileNotFoundException {
        saveMap(filename+"map");
    }

    public abstract void run();
}
