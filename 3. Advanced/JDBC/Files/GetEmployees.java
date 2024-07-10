//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.stream.Stream;
//
//public class GetEmployees implements DatabaseConnection {
//    public GetEmployees(String department) {
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
