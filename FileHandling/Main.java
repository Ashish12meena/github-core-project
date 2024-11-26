package FileHandling;

import java.io.*;
// import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
           try(InputStreamReader i = new InputStreamReader(System.in)){
               BufferedReader bufferedReader = new BufferedReader(i);
                  System.out.println(bufferedReader.readLine());
           } catch (Exception e) {
           }
    }
}

