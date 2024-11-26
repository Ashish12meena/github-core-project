public class exaptionHandling {
    public static void main(String[] args) {
        try {
           int result =  divide(10,0);
           System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
    }
    private static int divide(int i, int j) {
        // int result;
        //  try {
        //       result = i/j;
        //  } catch (Exception e) {
        //     result = -1;
        //  }
        //  return result;
        return i/j;
    }
}
