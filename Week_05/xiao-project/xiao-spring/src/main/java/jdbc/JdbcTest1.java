package jdbc;

import java.sql.*;

public class JdbcTest1 {

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
        String url = "jdbc:mysql://192.168.253.128:3306/test";	//设置连接路径
        String username = "root";	//数据库用户名
        String password = "root";	//数据库连接密码
        Connection con = null;
        PreparedStatement pstmt = null;	//使用预编译语句
        try {
            Class.forName(driverClassName); //执行驱动
            con = DriverManager.getConnection(url, username, password); //获取连接
            con.setAutoCommit(false);

        //新增
            String sql = "INSERT INTO atest VALUES(?,?,?,?)"; //设置的预编译语句格式
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,"111");
            pstmt.setString(2, "1111");
            pstmt.setInt(3, 1);
            pstmt.setString(4,"1");
            pstmt.executeUpdate();
            int  s = 1/0;
            con.commit();
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("aasd");
            try {
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }finally {
            con.close();
        }
    }
}
