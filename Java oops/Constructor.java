public class Constructor {
    int modelyear;
    String modelname;

    public Constructor(int year, String name){
        modelyear = year;
        modelname = name;
    }
    public static void main(String[] args) {
        Constructor myCar = new Constructor(2000, "Mustang");
        System.out.println(myCar.modelname + " " + myCar.modelyear);
    }
    
}
