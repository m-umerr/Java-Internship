//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.stream.Stream;
//
//public class GetTerminatedEmployee implements DatabaseConnection {
//    GetTerminatedEmployee() {
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
//}
