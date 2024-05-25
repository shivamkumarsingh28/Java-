class Vehicle {
    protected String brand = "SaeeAM";
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

// Inheritence in java


class Car extends Vehicle {
    private String modelName = "Mustang";

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();

        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
