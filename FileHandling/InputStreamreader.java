package FileHandling;

import java.io.BufferedReader;
// import java.io.FileInputStream;
// import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.io.Reader;

public class InputStreamreader {
     public static void main(String[] args) throws IOException {

        // String filePath = "FileHandling/file.txt";
        //  try(InputStreamReader i = new InputStreamReader(new FileInputStream(filePath))){
        //        BufferedReader bufferedReader = new BufferedReader(i);
        //          while (bufferedReader.ready()) {
        //             System.out.println(bufferedReader.readLine());
        //          }
        //    } catch (Exception e) {
        //  }
    
        


        // Reader r = new InputStreamReader(System.in);

        //  try(Reader reader = new InputStreamReader(System.in)) {
        //       int re =  reader.read();
        //         while (reader.ready()) {
        //             System.out.println((char)re);
        //             re = reader.read();
        //         }
        //  } catch (Exception e) {
        //     System.out.println(e.getMessage());
        //  }
        //  System.out.println( System.currentTimeMillis() );

         try(BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder paragraph = new StringBuilder();
            String line;
            System.out.println("Enter a paragraph (Press Enter twice to end):");
            while (!(line = reader.readLine()).isEmpty()) {
                paragraph.append(line).append("\n");
            }
            System.out.println(paragraph.toString());

         } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
         }


      
    }
}
