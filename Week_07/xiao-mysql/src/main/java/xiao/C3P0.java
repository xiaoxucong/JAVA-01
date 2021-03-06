package xiao;

import com.alibaba.druid.pool.DruidDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.mchange.v2.c3p0.ComboPooledDataSource;
public class C3P0 {


    /***
     * 28s
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        long start = System.currentTimeMillis();
        String driverClassName = "com.mysql.jdbc.Driver";	//启动驱动
        String url = "jdbc:mysql://localhost:3306/test";	//设置连接路径
        String username = "root";	//数据库用户名
        String password = "xxc4370";	//数据库连接密码

        ComboPooledDataSource  dataSource=new ComboPooledDataSource();
        dataSource.setJdbcUrl(url);
        dataSource.setDriverClass(driverClassName); //这个可以缺省的，会根据url自动识别
        dataSource.setUser(username);
        dataSource.setPassword(password);
        ExecutorService executor =  Executors.newFixedThreadPool(1000);

        for (int i = 1; i < 1001; i++) {
            String sql = "INSERT INTO `order` (userId, `order_no`, `sum_price`, `createtime`, `paymenttime`, `order_status`, `express_no`, `express_name`, `consignee_address`, `consignee_mobile`, `consignee_name`, `deleteStatus`) VALUES " ;
            for (int j = 1; j < 1001; j++) {
                int temp = i*j;
                if(j < 2) {
                    sql += " ("+temp+", 'order_no"+temp+"',  '"+temp+".00', '2021-03-03 09:38:53', '2021-03-03 09:39:13', 1, '"+temp+"', '"+temp+"', '"+temp+"', '"+temp+"', '"+temp+"', 0)";
                }else {
                    sql += " ,("+temp+", 'order_no"+temp+"',  '"+temp+".00', '2021-03-03 09:38:53', '2021-03-03 09:39:13', 1, '"+temp+"', '"+temp+"', '"+temp+"', '"+temp+"', '"+temp+"', 0)";
                }
            }
            String finalSql = sql;
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        te(dataSource, finalSql);
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
    private static void te(ComboPooledDataSource ds, String sql) throws SQLException {
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
