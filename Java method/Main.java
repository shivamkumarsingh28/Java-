public class Main {
    static void myMethod(String fname, int age) {
        System.out.println(fname + " I just got executed " + age);
    }

    // return value
    static int myMethod1(int x, int y) {
        return y + x;
    }

    // if condition 
    static void checkAge(int age) {
        if (age>=18) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }
    }

    
    static int plusMethod(int x, int y) {
        return x+y;
    }

    static double plusMethod(double x, double y) {
        return x+y;
    }

    static int minusMethod(int x, int y) {
        return x - y;
    }

    // method scope
    {
        int x = 10;
        System.out.println(x);
    }
    

    // recursion method
    public static int sum(int k) {
        if (k>0) {
            return k + sum(k-1);
        } else {
            return 0;
        }
    }

    // Halting condition
    public static int HaltingSum(int start, int end) {
        if (end > start){
            return end + HaltingSum(start, end -1);
        } else {
            return end;
        }
    }


    public static void main(String[] args) {
        // myMethod("shivam", 5);
        // myMethod("saeeam", 18);
        // myMethod("alfa", 19);

        // int z = myMethod1(5,5);

        // checkAge(18);
        // System.out.println(z);

        int myNum1 = plusMethod(8, 7);
        double myNum2 = plusMethod(4.3, 5.26);
        System.out.println("int:" + myNum1);
        System.out.println("double:" + myNum2);

        // recursion call
        int result = sum(10);
        System.out.println(result);
        
        // Halting call 
        int resHalting = HaltingSum(5, 10);
        System.out.println(resHalting);
    }



}