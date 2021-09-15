import com.codingfuture.entity.User;
import com.codingfuture.mapper.DeptMapper;
import com.codingfuture.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mapper.xml")
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void testfindDetailAllByUserId(){
        User users = userMapper.findDetailAllByUserId(1);
        System.out.println(users);
    }


}
