package xiao;

import java.sql.*;

public class jdbc {
    /***
     *
     * @param args
     * @throws SQLException
     */
    public static void main(String[] args) throws SQLException {
        long start = System.currentTimeMillis();
        String driverClassName = "com.mysql.jdbc.Driver";	//启动驱动
        String url = "jdbc:mysql://localhost:3306/test";	//设置连接路径
        String username = "root";	//数据库用户名
        String password = "xxc4370";	//数据库连接密码
            for (int i = 0; i < 1000000; i++) {
                Connection con = null;
                PreparedStatement pstmt = null;	//使用预编译语句
                try {
                    Class.forName(driverClassName); //执行驱动
                    con = DriverManager.getConnection(url, username, password); //获取连接
                    //新增
                    String sql = "INSERT INTO `order` (userId, `order_no`, `sum_price`, `createtime`, `paymenttime`, `order_status`, `express_no`, `express_name`, `consignee_address`, `consignee_mobile`, `consignee_name`, `deleteStatus`) VALUE ("+i+", "+i+",  '"+i+".00', '2021-03-03 09:38:53', '2021-03-03 09:39:13', 1, '"+i+"', '"+i+"', '"+i+"', '"+i+"', '"+i+"', 0)";
                    System.out.println("sql="+sql);

                    pstmt = con.prepareStatement(sql);
                    pstmt.executeUpdate();
                }catch (Exception e) {
                    e.printStackTrace();
                }finally {
                    con.close();
                }
            }
        long end = System.currentTimeMillis()-start;
        System.out.println("执行时间="+end);
    }
}
