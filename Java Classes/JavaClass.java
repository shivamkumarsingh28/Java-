public class JavaClass {
    int x = 5;
    int y = 9;
    // final that dont change value 
    final float pi = 3.14f;

    // multiple attribute 
    String fname = "Saeeam";
    String lname = "Singh";
    int age = 25;

    public static void main(String[] args) {

        // multiple object
        JavaClass myclassobj = new JavaClass();
        JavaClass myclassobj1 = new JavaClass();
        JavaClass myclassobj2 = new JavaClass();

        // modify attributes
        myclassobj.x = 50;

        // final not modify 
        // myclassobj.pi = 41.5f;

        System.out.println(myclassobj.x);
        System.out.println(myclassobj1.x);
        System.out.println(myclassobj2.pi);

        // access through class obj
        // myclassobj.fullout(myclassobj.fname, myclassobj.lname, myclassobj.age);

        fullout(myclassobj.fname, myclassobj.lname, myclassobj.age);
    
    }


    // public void fullout(String name, String lname, int age){
    //     System.out.println("name: " + name +" "+lname + " " + "Age: " +age);
    // }

    public static void fullout(String name, String lname, int age){
        System.out.println("name: " + name +" "+lname + " " + "Age: " +age);
    }
}
