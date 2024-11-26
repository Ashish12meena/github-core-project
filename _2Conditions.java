public class _2Conditions {
    public static void main(String[] args) {
        // check weather a given year is leap year is not?
        /*
         * int year = 1700;
         * if ((year%400)==0) {
         * System.out.println("its a leap year");
         * }else if ((year%100)!=0 && (year%4)==0) {
         * System.out.println("its a leap year");
         * }else{
         * System.out.println("Its not a leap year");
         * }
         */

        // Write program to find greater of 4 numbers a,b,c,d
        /*
         * int a=10;
         * int b= 3;
         * int c= 7;
         * int d = 15;
         * 
         * if (a>b&&a>c&&a>d) {
         * System.out.println("a: "+a);
         * }else if (b>c&& b>d) {
         * System.out.println("b: "+b);
         * }else if (c>d) {
         * System.out.println("c: "+c);
         * }else{
         * System.out.println("d: "+d);
         * }
         */

        // Write a program to find out percentage of marks obtained by a students in 5
        // subject out of 100 marks
        /*
         * float maths=60;
         * float science=70;
         * float English=80;
         * float Hindi=90;
         * float Social_Science=100;
         * float percentage = 0;
         * float total = maths+science+English+Hindi+Social_Science;
         * percentage = (total/500)*100;
         * System.out.println(percentage+"%");
         */

        // Write a program to convert temprature from celcius to f

        /*
         * int celcius = 0;
         * float f = 32 + celcius*(9/5);
         * System.out.println(f);
         */

        // Write a program to swap 2 numbers
        /*
         * int a = 30;
         * int b = 20;
         * 
         * a = a+b;
         * b = a-b;
         * a= a -b;
         * 
         * System.out.println("a: "+a+" b: "+b);
         */

        // Write a program to check whether a given numbers is prime or not
        int num = 2;
        
        boolean isPrime = true;

        if (num == 0 || num == 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime==true) {
            System.out.println("number is prime");
        }else{
            System.out.println("number is not prime");
        }

    }
}
