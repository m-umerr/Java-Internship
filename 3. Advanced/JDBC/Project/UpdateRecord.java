package project;

import java.sql.PreparedStatement;
import java.util.Objects;
import java.util.Scanner;

public class UpdateRecord implements DatabaseConnection {

    UpdateRecord(String columnName) {
        if (Objects.equals(columnName, "name") || Objects.equals(columnName, "hiredate") || Objects.equals(columnName, "status")) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter old value you want to update ?");
                String oldval = sc.next();
                System.out.println("Enter new value you want to update ?");
                String newval = sc.next();

                String query = String.format("update employees set %s = ? where %s = ?", columnName, columnName);

                PreparedStatement statement = connectToDb("EmployeeInformation", "postgres", "abc123").prepareStatement(query);
                statement.setString(1, newval);
                statement.setString(2, oldval);

                int rowsUpdated = statement.executeUpdate();
                if (rowsUpdated > 0) {
                    System.out.println("Data Updated Successfully");
                } else {
                    System.out.println("Failed to update data. No matching records found.");
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        } else if (Objects.equals(columnName, "age") || Objects.equals(columnName, "salary") || Objects.equals(columnName, "departmentid") ) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter old value you want to update ?");
                int oldval = Integer.parseInt(sc.next());
                System.out.println("Enter new value you want to update ?");
                int newval = Integer.parseInt(sc.next());

                String query = String.format("update employees set %s = ? where %s = ?", columnName, columnName);

                PreparedStatement statement = connectToDb("EmployeeInformation", "postgres", "abc123").prepareStatement(query);
                statement.setInt(1, newval);
                statement.setInt(2, oldval);

                int rowsUpdated = statement.executeUpdate();
                if (rowsUpdated > 0) {
                    System.out.println("Data Updated Successfully");
                } else {
                    System.out.println("Failed to update data. No matching records found.");
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            System.out.println("Invalid Column Name");
            System.exit(1);
        }
    }
}
