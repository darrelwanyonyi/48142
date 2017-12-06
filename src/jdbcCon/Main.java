package jdbcCon;

import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Connection con = new dbConnector().connector();

        System.out.println("Reply with");
        System.out.println("A - to add a new record");
        System.out.println("D - to delete a record");
        System.out.println("U - to update a record");

        String reply;
        Scanner scanner = new Scanner(System.in);
        reply = scanner.nextLine();

        switch (reply){

            case "A":
                int student_id;
                String first_name;
                String last_name;
                String gender;
                String program;

                System.out.println("Your Student ID");
                student_id = scanner.nextInt();

                System.out.println("Your First Name:");
                first_name = scanner.nextLine();

                System.out.println("Your Last Name:");
                last_name = scanner.nextLine();

                System.out.println("Your gender:");
                gender = scanner.nextLine();

                System.out.println("Your program:");
                program = scanner.nextLine();

                CrudOperations crudOperations = new CrudOperations();

                crudOperations.setStudent_id(student_id);
                crudOperations.setFirst_name(first_name);
                crudOperations.setLast_name(last_name);
                crudOperations.setGender(gender);
                crudOperations.setProgram(program);

                crudOperations.saveRecord();

                break;

            case "D":
                break;

            case "U":
                break;

            default:
                System.out.println("invalid entry");
        }
    }
}
