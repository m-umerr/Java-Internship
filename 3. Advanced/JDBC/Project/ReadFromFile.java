package project;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFromFile {

    public ReadFromFile() {
        List<Employee> employees = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File("C:\\Users\\mumer.muddassir\\Downloads\\employeeInformation.csv"))) {
            String DELIMITER = ",";

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] tokens = line.split(DELIMITER);

                int empid = Integer.parseInt(tokens[0].trim());
                String name = tokens[1].trim();
                int age = Integer.parseInt(tokens[2].trim());
                int departmentid = Integer.parseInt(tokens[3].trim());
                String hiredate = tokens[4].trim();
                int salary = Integer.parseInt(tokens[5].trim());
                String status = tokens[6].trim();

                Employee employee = new Employee(empid, name, age, departmentid, hiredate, salary, status);
                employees.add(employee);
            }
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        for (Employee emp : employees) {
            new InsertRecord(emp);
        }
    }
}