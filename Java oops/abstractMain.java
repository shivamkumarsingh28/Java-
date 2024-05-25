abstract class abstractMain {
    public String fname = "saeeam";
    public int age = 24;
    public abstract void study(); //abstract method

    }
    class Student extends abstractMain {
        public int graduationYear = 2018;
        public void study() {
            System.out.println("Studying all day long");
        }
    }
