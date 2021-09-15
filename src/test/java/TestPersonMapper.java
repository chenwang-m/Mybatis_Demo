import com.codingfuture.entity.Dept;
import com.codingfuture.mapper.DeptMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mapper.xml")
public class TestPersonMapper {
    @Autowired
    private DeptMapper deptMapper;

    @Test
    public void testFindAll() {
        for (Dept dept : deptMapper.findAll()) {
            System.out.println(dept);
        }
    }
    @Test
    public void testFindById(){
        for (Dept dept : deptMapper.findByID(10)){
            System.out.println(dept);
        }
    }
    @Test
    public void testAdd(){
        deptMapper.add("文学部","大连");
    }
    @Test
    public void testAdd2(){
        Dept dept = new Dept();
        dept.setDname("企画部");
        dept.setLoc("辽宁");
        deptMapper.add2(dept);
        System.out.println(dept.getDeptno());
    }
}
