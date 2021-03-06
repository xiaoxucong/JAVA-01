package xiao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.concurrent.*;

import  org.apache.commons.dbcp2.BasicDataSource;
public class DBCP {

    /***
     * 执行时间=27s
     * @param args
     * @throws SQLException
     */
    public static void main(String[] args) throws SQLException {
        long start = System.currentTimeMillis();
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/test");
        ds.setUsername("root");
        ds.setPassword("xxc4370");
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
                        te(ds, finalSql);
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

    private static void te(BasicDataSource ds, String sql) throws SQLException {
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
