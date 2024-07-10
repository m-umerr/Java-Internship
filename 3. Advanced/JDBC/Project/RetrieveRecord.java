package project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetrieveRecord implements DatabaseConnection {

    private Connection connection;

    public RetrieveRecord() {
        connection = connectToDb("EmployeeInformation", "postgres", "abc123");
    }

    public void getAllEmployees() {
        String query = "SELECT * FROM employees";
        executeQuery(query);
    }

    public void getEmployeesWithDepartment(int departmentid) {
        String query = "SELECT * FROM employees WHERE departmentid = "+departmentid;
        executeQuery(query);
    }

    public void getTerminatedEmployees() {
        String query = "SELECT * FROM employees WHERE status = 'Terminated'";
        executeQuery(query);
    }

    public void getHireDates() {
        String query = "SELECT empid, hiredate FROM employees";
        executeQuery(query);
    }

    public void getSalaries() {
        String query = "SELECT empid, salary FROM employees";
        executeQuery(query);
    }

    public void getEmployeesInDepartment(String department) {
        String query = "SELECT d.depname, COUNT(e.empid) AS total_employees " +
                "FROM departments d JOIN employees e ON d.depid = e.departmentid " +
                "WHERE d.depname = '"+department+"'"+ " GROUP BY d.depname";
        executeQuery(query);
    }

    private void executeQuery(String query) {
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            printResultSet(resultSet);
        } catch (SQLException e) {
            System.out.println("Error executing query: " + e.getMessage());
        }
    }

    private void printResultSet(ResultSet resultSet) throws SQLException {
        int columns = resultSet.getMetaData().getColumnCount();
        while (resultSet.next()) {
            for (int i = 1; i <= columns; i++) {
                System.out.print(resultSet.getString(i) + " ");
            }
            System.out.println();
        }
    }
}