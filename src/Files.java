import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Files {
    // read lines in file
    static String[] getLines(String filename) throws IOException {
        Scanner in = new Scanner(new FileReader(filename));
        ArrayList<String> machinesList = new ArrayList<String>();
        while(in.hasNextLine())
            machinesList.add(in.nextLine());
        return machinesList.toArray(new String[machinesList.size()]);
    }

    static void saveString(String filename, String value) throws IOException {
        PrintWriter out = new PrintWriter(filename);
        out.print(value);
        out.close();
    }
    static int splitInput(String inputFilename) throws IOException {
        String[] lines = getLines(inputFilename);
        int i = 0;
        for (String line : lines){
            PrintWriter out = new PrintWriter(inputFilename + (i++));
            out.println(line);
            out.close();
        }
        return lines.length;
    }
}