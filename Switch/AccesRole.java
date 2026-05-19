package DSA_mqt.Switch;

import java.util.Scanner;

public class AccesRole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String role = sc.nextLine();

        switch (role) {
            case "admin":
                System.out.println("Can access anything");
                break;
            case "Teacher":
                System.out.println("Can access all student details");
                break;
            case "Student":
                System.out.println("Can access Syllabus details");
                break;
            case "guest":
                System.out.println("Cannot access details");
                break;
            default:
                System.out.println("Wrong Role");
                
        }
    }
}
