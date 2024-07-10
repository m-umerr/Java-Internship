//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.stream.Stream;
//
//public class GetList implements DatabaseConnection {
//
//    public void getAllEmployees(){
//        try {
//            Statement statement = connectToDb("EmployeeInformation", "postgres", "abc123").createStatement();
//            String query = "select * from employees";
//            ResultSet rs = statement.executeQuery(query);
//
//            Stream<ResultSet> resultSetStream = Stream.of(rs);
//            resultSetStream.forEach(resultSet -> {
//                try {
//                    while (resultSet.next()) {
//                        System.out.print(resultSet.getInt(1) + " ");
//                        System.out.print(resultSet.getString(2) + " ");
//                        System.out.print(resultSet.getInt(3) + " ");
//                        System.out.print(resultSet.getInt(4) + " ");
//                        System.out.print(resultSet.getString(5) + " ");
//                        System.out.print(resultSet.getInt(6) + " ");
//                        System.out.println(resultSet.getString(7) + " ");
//                    }
//                } catch (Exception e) {
//                    System.out.println(e);
//                }
//            });
//        }catch (Exception e){
//            System.out.println("Error");
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public void getEmployeesWithDepartment(int departmentid){
//        try {
//            Statement statement = connectToDb("EmployeeInformation", "postgres", "abc123").createStatement();
//            String query = "select * from employees where departmentid = '"+departmentid+"'";
//            ResultSet rs = statement.executeQuery(query);
//
//            Stream<ResultSet> resultSetStream = Stream.of(rs);
//            resultSetStream.forEach(resultSet -> {
//                try {
//                    while (resultSet.next()) {
//                        System.out.print(resultSet.getInt(1) + " ");
//                        System.out.print(resultSet.getString(2) + " ");
//                        System.out.print(resultSet.getInt(3) + " ");
//                        System.out.print(resultSet.getInt(4) + " ");
//                        System.out.print(resultSet.getString(5) + " ");
//                        System.out.print(resultSet.getInt(6) + " ");
//                        System.out.println(resultSet.getString(7) + " ");
//                    }
//                } catch (Exception e) {
//                    System.out.println(e);
//                }
//            });
//
//        }catch (Exception e){
//            System.out.println(e);
//        }
//    }
//
//    public void getTerminatedEmployee(){
//        try {
//            Statement statement = connectToDb("EmployeeInformation", "postgres", "abc123").createStatement();
//            String query = "select * from employees where status = 'Terminated'";
//            ResultSet rs = statement.executeQuery(query);
//
//            Stream<ResultSet> resultSetStream = Stream.of(rs);
//            resultSetStream.forEach(resultSet -> {
//                try {
//                    while (resultSet.next()) {
//                        System.out.print(resultSet.getInt(1) + " ");
//                        System.out.print(resultSet.getString(2) + " ");
//                        System.out.print(resultSet.getInt(3) + " ");
//                        System.out.print(resultSet.getInt(4) + " ");
//                        System.out.print(resultSet.getString(5) + " ");
//                        System.out.print(resultSet.getInt(6) + " ");
//                        System.out.println(resultSet.getString(7) + " ");
//                    }
//                } catch (Exception e) {
//                    System.out.println(e);
//                }
//            });
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//
//    public void getHireDate(){
//        try {
//            Statement statement = connectToDb("EmployeeInformation", "postgres", "abc123").createStatement();
//            String query = "select empid, hiredate from employees";
//            ResultSet rs = statement.executeQuery(query);
//
//            Stream<ResultSet> resultSetStream = Stream.of(rs);
//            resultSetStream.forEach(resultSet -> {
//                try {
//                    while (resultSet.next()) {
//                        System.out.print(resultSet.getInt("empid")+" ");
//                        System.out.println(resultSet.getString("hiredate"));
//                    }
//                } catch (Exception e) {
//                    System.out.println(e);
//                }
//            });
//
//        }catch (Exception e){
//            System.out.println(e);
//        }
//    }
//
//    public void GetSalary(){
//        try {
//            Statement statement = connectToDb("EmployeeInformation", "postgres", "abc123").createStatement();
//            String query = "select empid, salary from employees";
//            ResultSet rs = rs = statement.executeQuery(query);
//
//            Stream<ResultSet> resultSetStream = Stream.of(rs);
//            resultSetStream.forEach(resultSet -> {
//                try {
//                    while (resultSet.next()) {
//                        System.out.print(resultSet.getInt("empid")+" ");
//                        System.out.println(resultSet.getInt("salary"));
//                    }
//                } catch (Exception e) {
//                    System.out.println(e);
//                }
//            });
//
//        }catch (Exception e){
//            System.out.println(e);
//        }
//    }
//
//    public void getEmployees(String department){
//        try {
//            Statement statement = connectToDb("EmployeeInformation", "postgres", "abc123").createStatement();
//            String query = "SELECT d.depname, COUNT(e.empid) AS total_employees " +
//                    "FROM departments d " +
//                    "JOIN employees e ON d.depid = e.departmentid " +
//                    "WHERE d.depname = '" +department+"' "+
//                    "GROUP BY d.depname;";
//            ResultSet rs = statement.executeQuery(query);
//
//            Stream<ResultSet> resultSetStream = Stream.of(rs);
//            resultSetStream.forEach(resultSet -> {
//                try {
//                    while (resultSet.next()) {
//                        String dept = resultSet.getString("depname");
//                        int totalEmployees = resultSet.getInt("total_employees");
//                        System.out.println("Department: " + dept + ", Total Employees: " + totalEmployees);
//                    }
//                } catch (Exception e) {
//                    System.out.println(e);
//                }
//            });
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}