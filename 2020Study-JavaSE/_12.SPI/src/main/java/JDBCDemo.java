import org.junit.Test;

import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

public class JDBCDemo {
    /**
     * JDBC测试
     * @throws SQLException
     */
    @Test
    public void test01() throws SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/mytestdb?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=GMT&useSSL=false";
        DriverManager.setLogWriter(new PrintWriter(System.out));
        Connection conn = DriverManager.getConnection(url,"root","ROOT1234");
        System.out.println(conn);
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from mytable2;");
        while(resultSet.next()){
            System.out.print(resultSet.getString(1)+" ");
            System.out.println(resultSet.getString(2));
        }

    }
    @Test
    public void test02(){
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("helloworld");
        boolean b = arrayList.addAll(new ArrayList<>());
        System.out.println(b);
        HashMap<String,String> map=new HashMap<>();
        map.put(null,null);
    }

}
