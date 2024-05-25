public class BooleanInJava {
    public static void main(String[] args) {
        int myAge = 15;
        int votingAge = 18;

        if (myAge >= votingAge) {
            System.out.println("Old enough to vote");
        } else {
            System.out.println("Not old enough to vote");
        }

        int time = 22;
        if (time < 10) {
            System.out.println("Good Morning");
        } else if (time < 18) {
            System.out.println("Good Day.");
        } else {
            System.out.println("Good evening");
        }

        // shorthand if condition
        String result = (time <18) ? "Good day." :"Good evening";
        System.out.println(result);

    }
    
}
