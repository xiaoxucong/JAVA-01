package jdbc;

import java.sql.*;

public class JdbcTest {

    /***

     CREATE TABLE `atest` (
     `username` varchar(255) DEFAULT NULL,
     `password` varchar(255) DEFAULT NULL,
     `age` int(11) DEFAULT NULL,
     `gender` varchar(255) DEFAULT NULL
     ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

     * @param args
     * @throws SQLException
     */
    public static void main(String[] args) throws SQLException {
        String driverClassName = "com.mysql.jdbc.Driver";	//启动驱动
        String url = "jdbc:mysql://localhost:3306/test";	//设置连接路径
        String username = "root";	//数据库用户名
        String password = "123456";	//数据库连接密码
        Connection con = null;
        PreparedStatement pstmt = null;	//使用预编译语句
        ResultSet rs = null;	//获取的结果集
        try {
            Class.forName(driverClassName); //执行驱动
            con = DriverManager.getConnection(url, username, password); //获取连接

        //新增
            String sql = "INSERT INTO atest VALUES(?,?,?,?)"; //设置的预编译语句格式
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,"111");
            pstmt.setString(2, "1111");
            pstmt.setInt(3, 1);
            pstmt.setString(4,"1");
            pstmt.executeUpdate();
            //修改
            String sql_1 = "update atest set username=?"; //设置的预编译语句格式
            pstmt = con.prepareStatement(sql_1);
            pstmt.setString(1,"测试");
            pstmt.executeUpdate();
            //查询
            String sql_2 = "select * from atest  "; //设置的预编译语句格式
            pstmt = con.prepareStatement(sql_2);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("username"));
            }

            //删除
           String sql_3 = "delete from atest  "; //设置的预编译语句格式
            pstmt = con.prepareStatement(sql_3);
            pstmt.executeUpdate();


        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            con.close();
            rs.close();
        }
    }
}
