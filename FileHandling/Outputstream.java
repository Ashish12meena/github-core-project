package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
// import java.io.IOException;
// import java.io.OutputStream;
// import java.io.OutputStreamWriter;
// import java.io.PrintStream;

public class Outputstream {
    public static void main(String[] args) {
        String filepath = "FileHandling/file.txt";
            // PrintStream ps = new PrintStream(System.out);
            // ps.write(89);
            // ps.write('c');
            // System.out.println();
            // try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
            //     osw.write("ashish meena");
            //     osw.write(78);
            //     // osw.write(true);

            // } catch (Exception e) {
                
            // }


            try (BufferedWriter bfw = new BufferedWriter(new FileWriter(filepath,true))) {
                bfw.write("Hello ashish");
                bfw.append("meena");
                
            } catch (Exception e) {
                e.printStackTrace();
            }

            

            
    }
}
