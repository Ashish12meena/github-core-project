public class _4DyanmicPattern {
    public static void main(String[] args) {
        // int n=5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Write a program to print the following pattern
        // 12345
        // 1234
        // 123
        // 123
        // 12
        // 1f

        // int n=6;
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // int n=6;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i+(i-1); j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // int n = 5;
        // int count=1;
        // for (int i = 0; i < n; i++) {
        // for (int j = 1; j <= i+1; j++) {
        // System.out.print(count);
        // count++;
        // }
        // System.out.println();
        // }

        // Write pattern
        /*
         * A
         * B c
         * D E F
         * G H I J
         */

        // int count = 65;
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print((char)count);
        // count++;
        // }
        // System.out.println();
        // }

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int k = 1; k <= n-i; k++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= 2*i-1; j++) {
        // System.out.print(j+" ");
        // }
        // System.out.println();
        // }

        //

        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        //     if (i==1||i==n) {
        //         for (int j = 1; j <= n; j++) {
        //             System.out.print("*");
        //         }
        //         System.out.println();
        //     }else{
        //         for (int j = 1; j <= n; j++) {
        //             if (j==1||j==n) {
        //                 System.out.print("*");
        //             }else{
        //                 System.out.print(" ");
        //             }
        //         }
        //         System.out.println();
        //     }
           
        // }


        //Q.)  
        //              *
        //            * *
        //          * * *
        //        * * * *
        //      * * * * *

       /*  int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n-i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
            */

        // Q.) 
        /*  
         *      1
         *      0 1
         *      0 1 0
         *      1 0 1 0 
         *      1 0 1 0 1
         *      0 1 0 1 0 1
         *      0 1 0 1 0 1 0
         *      1 0 1 0 1 0 1 0 
         */
        // boolean count = true;
        // int n = 5;
        // for (int i = 1; i <=n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         if (count) {
        //             System.out.print("1");
        //             count = false;
        //         }else{
        //             System.out.print("0");
        //             count = true;
        //         }
        //     }
        //     System.out.println();
        // }

        // Q.) 
        //   1
        //   1 2 1
        //   1 2 3 2 1 
        //   1 2 3 4 3 2 1 
        //   1 2 3 4 5 4 3 2 1

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        //         for (int k = 1; k < i; k++) {
        //             System.out.print(k);
        //         }
        //         for (int j = i; j >= 1; j--) {
        //             System.out.print(j);
        //         }
        //     System.out.println();
        // }

        //Q.) 
        // 1
        // * *
        // 1 2 3
        // * * * *
        // 1 2 3 4 5 

        int n =5;
        for (int i = 1; i <= n; i++) {
            if (i%2==0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }  
            }
            else{
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }  
            }
            System.out.println();
        }


    }

}
