package dao;

import com.sel.core.dao.IMenuDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //指定测试用例的运行器 这里是指定了Junit4
@ContextConfiguration("classpath:spring-context.xml")
public class MenuDaoTest {

    @Autowired
    private IMenuDao menuDao;

    @Test
    public void test(){
        System.out.println(menuDao.getMenuCount());
    }
}
