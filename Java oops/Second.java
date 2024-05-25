

class Second {

    static void myMethod2() {
        System.out.println("Print hello from second class");
    }
    public static void main(String[] args) {
        // create a object
        // Main myObj = new Main();
        Mains myObj1 = new Mains();
        // Mains myCar = new Mains();
        // FinalJava myfinal = new FinalJava();
        Student myStudent = new Student();
        


        // System.out.println("Name: " + myStudent.fname);
        // System.out.println("Age: " + myStudent.age);
        // System.out.println("Graduation Year: " + myStudent.graduationYear);
        myStudent.study();
        System.out.println(myStudent.graduationYear);
        
        // System.out.println(myObj.x);
        // System.out.println(myObj.x);
        myObj1.x = 10;
        // System.out.println(myObj1.x);
        // System.out.println(myObj.y);

        // System.out.println(myObj.fname);
        // System.out.println(myObj.lname);
        // System.out.println(myObj.age);

        // myMethod2();
        // myObj.myMethod();
        // myObj1.myMethod1();
        // myCar.fullThrottle();
        // myCar.speed(50);
        // System.out.println(myfinal.x);
        // System.out.println(myfinal.PI);
    }
}
