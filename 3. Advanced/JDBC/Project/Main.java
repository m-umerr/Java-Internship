package project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RetrieveRecord getRecord = new RetrieveRecord();
//        test getRecord = new test();
        String choice;

        do {
            System.out.println("Choose an option:");
            System.out.println("1. Insert Record");
            System.out.println("2. Update Record");
            System.out.println("3. List of employees");
            System.out.println("4. List of employees of a particular department");
            System.out.println("5. List of terminated employees");
            System.out.println("6. Get Hire Date");
            System.out.println("7. Get Salary");
            System.out.println("8. Count Employees");
            System.out.println("9. Insert Employees from file");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Insert Record option selected.");
//                    InsertRecord insertRecord = new InsertRecord("Umer", 21, 201, "2024-06-24", 5000, "Employed");
//                    insertRecord = new InsertRecord("Haris", 24, 205, "2024-05-09", 25000, "Employed");
//                    insertRecord = new InsertRecord("Hussain", 25, 201, "2020-12-21", 60000, "Employed");
//                    insertRecord = new InsertRecord("Asghar", 30, 209, "2022-08-11", 92000, "Terminated");
//                    insertRecord = new InsertRecord("Ahsan", 28, 201, "2019-01-01", 200000, "Employed");
//                    insertRecord = new InsertRecord("Ebad", 23, 205, "2022-02-22", 45000, "Employed");
//                    insertRecord = new InsertRecord("Younus", 26, 212, "2020-09-18", 98000, "Employed");
                    break;

                case "2":
                    System.out.println("Update Record option selected.");
                    System.out.println("Which table you want to update ?");
                    String value = scanner.next();
                    UpdateRecord update = new UpdateRecord(value);
                    break;

                case "3":
                    System.out.println("List of employees option selected.");
                    getRecord.getAllEmployees();
                    break;

                case "4":
                    System.out.println("List of employees of a particular department option selected.");
                    System.out.print("Enter department ID: ");
                    int departmentid = scanner.nextInt();
                    scanner.nextLine();
                    getRecord.getEmployeesWithDepartment(departmentid);
                    break;

                case "5":
                    System.out.println("List of terminated employees option selected.");
                    getRecord.getTerminatedEmployees();
                    break;

                case "6":
                    System.out.println("Get Hire Date option selected.");
                    getRecord.getHireDates();
                    break;

                case "7":
                    System.out.println("Get Salary option selected.");
                    getRecord.getSalaries();
                    break;

                case "8":
                    System.out.println("Count Employees option selected.");
                    System.out.print("Enter department: ");
                    String department = scanner.nextLine();
                    getRecord.getEmployeesInDepartment(department);
                    break;

                case "9":
                    System.out.println("Insert Employees from file option selected.");
                    ReadFromFile readFromFile = new ReadFromFile();

                case "0":
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
            System.out.println();
        } while (!choice.equals("0"));

    }
}