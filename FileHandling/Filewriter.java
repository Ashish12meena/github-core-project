package FileHandling;

import java.io.FileWriter;

public class Filewriter {
    public static void main(String[] args) {
                String filePath = "FileHandling/file2.txt";

        try (FileWriter fw = new FileWriter(filePath, true)) {   //automatically create new file if not existed 
            fw.write(filePath);
            fw.append("ashish");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
