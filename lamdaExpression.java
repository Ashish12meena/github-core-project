interface testInterface {
    public int display(int a, int b);

}
public class lamdaExpression {
    public static void main(String[] args) {
        testInterface s = (int a, int b)->{return a+b;};
        System.out.println(s.display(9, 10));
    }
}