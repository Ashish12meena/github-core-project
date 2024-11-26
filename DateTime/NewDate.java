package DateTime;

import java.time.LocalDateTime;
import java.util.Date;
public class NewDate {
     public static void main(String[] args) {
     Date date = new Date();
     Long timest =  date.getTime();
     System.out.println(timest);
     System.out.println(System.currentTimeMillis());

     Date dob = new Date();
     dob.setDate(32);
     LocalDateTime localDateTime = LocalDateTime.now();
     String s = localDateTime.now().toString();
     System.out.println(s);

     }
}
