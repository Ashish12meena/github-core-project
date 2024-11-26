package FileHandling;

import java.io.EOFException;
import java.io.FileInputStream;
// import java.io.FileOutputStream;
import java.io.ObjectInputStream;
// import java.io.ObjectOutputStream;
import java.io.Serializable;
// import java.util.List;

class Student implements Serializable{
    // private int id;
    String name;
    public Student(int id, String name) {
        // this.id = id;
        this.name = name;
    }
    public Student() {
        
    }
}
public class SerliazationDes {
  public static void main(String[] args) { 

     String filepath = "FileHandling/file.txt";
    //    Student s = new Student(1, "Ashish");
    //    Student s1 = new Student(2, "Uday");
    //    Student s2 = new Student(3, "Rahul");


    //    try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filepath))) {
    //         out.writeObject(s);
    //         out.writeObject(s1);
    //         out.writeObject(s2);
    //         System.out.println("Serialized data is saved in file.txt  ");
    //    } catch (Exception e) {
           
    //    }

       try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filepath)) ) {
               while (true) {
                try {
                    Student student = (Student) in.readObject();
                    System.out.println("Deserialized: " + student.name);
                } catch (EOFException e) {
                    break; // End of file reached
                }
            }
       } catch (Exception e) {
            e.printStackTrace();
       }
  }
}
