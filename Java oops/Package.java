import java.util.Scanner;

class Package {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter username");

        String username = myobj.nextLine();
        System.out.println("Username is:" + username);
    }
}
