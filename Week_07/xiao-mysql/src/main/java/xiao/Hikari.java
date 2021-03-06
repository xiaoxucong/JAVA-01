package xiao;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Hikari {

    /***
     * 28s
     * @param args
     * @throws SQLException
     */
    public static void main(String[] args) throws SQLException {
        long start = System.currentTimeMillis();
        String driverClassName = "com.mysql.jdbc.Driver";	//启动驱动
        String url = "jdbc:mysql://localhost:3306/test";	//设置连接路径
        String username = "root";	//数据库用户名
        String password = "xxc4370";	//数据库连接密码

            HikariConfig config = new HikariConfig();
            config.setJdbcUrl("jdbc:mysql://localhost:3306/test");//?rewriteBatchedStatements=true
            config.setDriverClassName("com.mysql.jdbc.Driver");
            config.setPassword("xxc4370");
            config.setUsername("root");
            config.setMinimumIdle(20);
            HikariDataSource sHikariDataSource = new HikariDataSource(config);
        ExecutorService executor =  Executors.newFixedThreadPool(5000);
        for (int i = 0; i < 1000; i++) {
            String sql = "INSERT INTO `order` (userId, `order_no`, `sum_price`, `createtime`, `paymenttime`, `order_status`, `express_no`, `express_name`, `consignee_address`, `consignee_mobile`, `consignee_name`, `deleteStatus`) VALUES " ;

            for (int j = 0; j < 1000; j++) {
                int s = i+1;
                int d = j+1;
                int temp = s*d;
                if(j < 1) {
                    sql += " ("+temp+", '肖绪聪"+temp+"',  '"+temp+".00', '2021-03-03 09:38:53', '2021-03-03 09:39:13', 1, '"+temp+"', '"+temp+"', '"+temp+"', '"+temp+"', '"+temp+"', 0)";
                }else {
                    sql += " ,("+temp+", '肖绪聪"+temp+"',  '"+temp+".00', '2021-03-03 09:38:53', '2021-03-03 09:39:13', 1, '"+temp+"', '"+temp+"', '"+temp+"', '"+temp+"', '"+temp+"', 0)";
                }
            }
            String finalSql = sql;
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        te(sHikariDataSource, finalSql);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        executor.shutdown();
        long end = (System.currentTimeMillis()-start)/1000l;
        System.out.println("执行时间="+end+"s");
    }
    private static void te(HikariDataSource ds, String sql) throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;	//使用预编译语句
        try {
            con = ds.getConnection();
            //新增
            pstmt = con.prepareStatement(sql);
            pstmt.executeUpdate();

        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            con.close();
        }
    }
}
