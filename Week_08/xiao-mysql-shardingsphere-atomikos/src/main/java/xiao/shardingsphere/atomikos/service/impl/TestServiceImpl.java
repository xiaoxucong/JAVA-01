package xiao.shardingsphere.atomikos.service.impl;

import org.apache.shardingsphere.transaction.annotation.ShardingTransactionType;
import org.apache.shardingsphere.transaction.core.TransactionType;
import org.apache.shardingsphere.transaction.core.TransactionTypeHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xiao.shardingsphere.atomikos.mapper.TestMapper;
import xiao.shardingsphere.atomikos.service.TestService;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TestServiceImpl implements TestService {

    private final DataSource dataSource;

    TestServiceImpl(final DataSource dataSource) {
        this.dataSource = dataSource;
    }


    @Autowired
    private TestMapper testMapper;
    @Override
    public List<Map<String, Object>> findAll() {
        return testMapper.findAll();
    }
    @Transactional
    @Override
    public void add() {
        System.out.println("-------------------- Process Start ---------------------");
        TransactionTypeHolder.set(TransactionType.XA);
        try (Connection connection = dataSource.getConnection()) {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement("   INSERT INTO  `t_order`  (user_id, `order_no`, `sum_price`, `createtime`, `paymenttime`,\n" +
                    "        `order_status`, `express_no`, `express_name`, `consignee_address`, `consignee_mobile`,\n" +
                    "        `consignee_name`, `deleteStatus`)\n" +
                    "         VALUE\n" +
                    "             (1, 'order_no1',  '1.00', '2021-03-03 09:38:53',\n" +
                    "             '2021-03-03 09:39:13',1, '1', '1', '1', '1', '1', 0)");

            connection.commit();
            System.out.println("INSERT 10 orders success");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            TransactionTypeHolder.clear();
        }
    }


    @Transactional
    @ShardingTransactionType(TransactionType.XA) // ⽀持 TransactionType.LOCAL,TransactionType.XA, TransactionType.BASE
    public void insert() {
        Map<String, Object> param = new HashMap<>();
        param.put("user_id",17);
        param.put("order_status",1);
        testMapper.addsd(param);
    }
}
