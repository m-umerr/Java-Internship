package project;

import java.sql.Statement;

public class InsertRecord implements DatabaseConnection {

    public InsertRecord(Employee employee) {
        Statement statement = null;
        try {
            String query = String.format("INSERT INTO employees " + "VALUES (%d, '%s', %d, %d, '%s', %d, '%s')",
                    employee.getEmpid(), employee.getName(), employee.getAge(), employee.getDepartmentid(),
                    employee.getHiredate(), employee.getSalary(), employee.getStatus());

            statement = connectToDb("EmployeeInformation", "postgres", "abc123").createStatement();
            statement.executeUpdate(query);
            System.out.println("Record Inserted Successfully");

        } catch (Exception e) {
            System.out.println("Error inserting record: " + e.getMessage());
        }
    }
}
