public class JavaConstructor {
    int modelyear;
    String modelName;

    public JavaConstructor(int year, String name){
        modelName = name;
        modelyear = year;
    }
    
    public static void main(String[] args) {
        JavaConstructor myobj = new JavaConstructor(2002, "mustang");
        System.out.println(myobj.modelName + myobj.modelyear);

    }
}
