//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.stream.Stream;
//
//public class GetSalary implements DatabaseConnection {
//    GetSalary(){
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
//}
