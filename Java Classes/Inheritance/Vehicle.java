package Inheritance;

class Vehicle {
    protected String brand = "ford";

    public void honk(){
        System.out.println("tuut, tuut!");
    }
}


class Car extends Vehicle {
    private String ModelName = "Mustang";
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();

        System.out.println(myCar.brand + " " + myCar.ModelName);
    }
}