import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String deparment;
    private int mailBoxCapacity;
    private int defaultPasswordLength = 10;
    private String alternateEmail;

    //Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: " + this.firstName + " " + this.lastName);

        //Call a method asking for the department - return the department
        this.deparment = setDepartment();
        System.out.println("Department: " + this.deparment);

        //Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);
    }

    //ask for the department
    private String setDepartment() {
        System.out.print("Department Codes:\n1. for Development\n2. for Technical Support\n3. for Administration\n0. for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "Development";
        } else if (depChoice == 2) {
            return "Technical Support";
        } else if (depChoice == 3) {
            return "Administration";
        } else {
            return "";
        }
    }

    //Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
        char[] password = new char[length];
        for(int i = 0; i<length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String (password);

    }
}
