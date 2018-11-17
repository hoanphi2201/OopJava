package week10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phixuanhoan
 */
public class Utils {
    public static String s = "23423";
    public
            static 
        String readContentFromFile(String path) throws IOException {
        FileReader reader = null;
        try {
            File file = new File(path);
            reader = new FileReader(file);
            BufferedReader in = new BufferedReader(reader);
            String line = in.readLine();
            String s = "";
            while (line != null) {
                s += (line + "\n");
                line = in.readLine();
            }
            return s;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;

    }

    public static void writeContentToFile(String path, String s, boolean type) throws IOException {
        File file = new File(path);
        FileWriter writer = new FileWriter(file, type);
        PrintWriter out = new PrintWriter(writer);
        try {
            out.print(s);
            out.close();
        } catch (Exception e) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public static File findFileByName  (String folderPath, String fileName) {
        File dir = new File(folderPath);
        File[] matches = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.equals(fileName) && name.endsWith(".txt");

            }
        });
        return matches.length > 0 ? matches[0] : null;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(readContentFromFile("hoanphi.txt"));
        writeContentToFile("hoanphi.txt", "Phi Xuan Hoan UET-VNU 1999", true);  // ghi nối
        System.out.println(findFileByName("data", "hoanphi.txt"));
    }

}
