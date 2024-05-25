public class Mains {
    int x = 5;
    int y = 9;
    String fname = "saeeam";
    String lname = "singh";
    int age = 25;

    // static void myMethod() {
    //     System.out.println("static hello from main class");
    // }

    // public void myMethod1() {
    //     System.out.println("public hello from main class");
    // }

    static void myStaticMethod() {
        System.out.println("Static method can be called without creating object");
    }

    public void myPublicMethod() {
        System.out.println("public method must be called by creating objects");
    }


    public void fullThrottle() {
        System.out.println("This car is going as fast as it can!");
    }
    
    public void speed(int maxSpeed) {
        System.out.println("Max Speed is:" + maxSpeed);
    }
    
    public static void main(String[] args) {
        myStaticMethod();

        Mains myObj = new Mains();
        myObj.myPublicMethod();
    }
}