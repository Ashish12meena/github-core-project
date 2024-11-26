package Collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student{
    private int id=0;
    private String name;
    private double marks;

    public Student(double marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
    
}

public class Comparators {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3.25, "ashish"));
        list.add(new Student(9.25, "ramesh"));
        list.add(new Student(7.25, "rjesh"));
        list.add(new Student(7.25, "lokesh"));

        // list.sort((a,b)->{return (a.getName().length()-b.getName().length());});
        // for (Student student : list) {
        //     System.out.println(student.getName());
        // }
        
        Comparator<Student> comparator = Comparator.comparing(Student::getMarks).reversed().thenComparing(Student::getName);
        list.sort(comparator);
        for (Student student : list) {
            System.out.println(student.getName());
        }
        list.sort((a,b)->{
            if (a.getMarks()-b.getMarks()<0) {
                return 1;
            }else if(a.getMarks()-b.getMarks()>0){
              return  -1;
            }
            else{
                return 0;
            }
        });
        for (Student student : list) {
            System.out.println(student.getName());
        }
    }
}
