
interface Add {
    public double add(double a, double b);
}
interface Subtract {
    public double subtract(double a, double b);
}
interface Multiple {
    public double multiple(double a, double b);
}
interface Division {
    public double division(double a, double b);
}
class Calculator {

    Add add= (double a, double b) ->{return a+b;};
    Subtract sub= (double a, double b) ->{return a-b;};
    Multiple mul= (double a, double b) ->{return a*b;};
    Division div= (double a, double b) ->{ if (b!=0) {
        return a/b;
    }else{
        return Double.NaN;
    }};



}
public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("add "+calc.add.add(4, 2));
        System.out.println("sub "+calc.sub.subtract(6, 32));
        System.out.println("mul "+ calc.mul.multiple(21, 2));
        System.out.println("div "+calc.div.division(21, 0));
    }
}
