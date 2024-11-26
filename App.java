public class App {
    public static void main(String[] args) {
        Student s = new Student();
        Aadhar a = new Aadhar();
        a.setAadharId(1);
        a.setAadharNo("789834858");
        s.setAadhar(a);
        System.out.println(s.getAadhar().getAadharNo());
    }
}
