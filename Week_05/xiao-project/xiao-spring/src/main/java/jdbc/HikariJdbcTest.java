package jdbc;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;

import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class HikariJdbcTest {
    @Test
    public   void aa( ) throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;	//使用预编译语句

        try {
            InputStream is = HikariJdbcTest.class.getClassLoader().getResourceAsStream("datasource.properties");
            // 加载属性文件并解析：
            Properties props = new Properties();
            props.load(is);
            HikariConfig config = new HikariConfig(props);
            HikariDataSource sHikariDataSource = new HikariDataSource(config);
            con = sHikariDataSource.getConnection();
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
