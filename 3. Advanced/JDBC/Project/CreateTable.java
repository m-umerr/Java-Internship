package project;

import java.sql.Statement;

public class CreateTable implements DatabaseConnection{
    public CreateTable(String tableName){
        try {
            Statement statement= connectToDb("EmployeeInformation", "postgres", "abc123").createStatement();
            String query = "create table " + tableName + "(EMPID SERIAL, NAME varchar(100), AGE int, DEPARTMENTID int, HireDate DATE, Salary INT, Status varchar(20), Primary key(EMPID));";
            statement.executeUpdate(query);
            System.out.println("Table Created Successfully");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
