package xiao.pojo;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@ContextConfiguration(classes=Klass.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class KlassTest {
    @Autowired
    @Qualifier("klass")
    private  Klass klass ;
    @Test
    public void createDeployment() {
        System.out.println(klass);
    }

}
