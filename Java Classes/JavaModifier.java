abstract class JavaModifier {

    public String fname = "SaeeAM";
    public int age = 24;
    public abstract void study();

    
}

class Subclass extends JavaModifier {
    public int graduationYear = 2024;
    public void study(){
        System.out.println("Studying all day long");
    }
}

class Other {
    public static void main(String[] args) {
        Subclass myObj = new Subclass();
        System.out.println(myObj.fname);
        System.out.println(myObj.age);
        System.out.println(myObj.graduationYear);
        myObj.study();

    }
}
