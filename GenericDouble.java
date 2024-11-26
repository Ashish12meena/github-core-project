import java.util.Arrays;

public class GenericDouble  {

    public static <T> T sum(T a){
       System.out.println();
      return a;
    }
    public static void main(String[] args) {
         //  Integer a = 5;
        // System.out.println( a.toString()); 
        // String s[] = {"ashish","vakul"};
         String a[] ={"ashish","heloo"};
         //sum(a);
         System.out.println(Arrays.toString(sum(a)));
    }
}
