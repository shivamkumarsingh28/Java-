public class Strings {
    public static void main(String[] args) {
        String greeting = "Please locate where 'locate' occurs!";
        // System.out.println(greeting.length());
        // System.out.println(greeting.toUpperCase());
        // System.out.println(greeting.toLowerCase());
        // System.out.println(greeting.indexOf("locate"));

        // String Concatenation
        String Fname = "Saeeam ";
        String Lname = "Singh";
        // System.out.println(Fname + "" + Lname);
        // System.out.println(Fname.concat(Lname));


        // math 
        int Fnumber = 5;
        int Snumber = 10;
        double myabs = -4.66d;

        int output = Math.max(Fnumber, Snumber);
        int output1 = Math.min(Fnumber, Snumber);
        // int output2 = Math.abs(myabs);
        int randomNum = (int) (Math.random() * 101);

        System.out.println(output1);
        System.out.println(output);
        System.out.println(randomNum);


    }
}
