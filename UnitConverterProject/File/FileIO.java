package File;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import Entity.Conversion;

public class FileIO {
    public static void saveHistory(ArrayList<Conversion> history) {
        try {
            FileWriter fw = new FileWriter("./File/conversion_history.txt");
            for (Conversion c : history) {
                fw.write(c.getInfo());
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("Error saving history: " + e.getMessage());
        }
    }
}
