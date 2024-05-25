public class Otherfile {
    public static void main(String[] args) {
        Person myPerson = new Person();
        myPerson.setName("hello");
        System.out.println(myPerson.getName());

        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
