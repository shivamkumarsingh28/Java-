public class JavaMethod {
    static void mystaticmethod() {
        System.out.println("static method");
    }

    public void mypublicmethod(){
        System.out.println("public method");
    }

    public static void main(String[] args) {
        JavaMethod myobj = new JavaMethod();
        myobj.mypublicmethod();
        mystaticmethod();
    }
}
