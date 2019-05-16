package base;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * Created by Administrator on 2017/10/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:META-INF/spring/spring-database.xml",
        "classpath*:META-INF/spring/spring-mybatis.xml",
        "classpath*:META-INF/spring/spring-resource.xml", 
        "classpath*:META-INF/spring/spring-service.xml"})
public class BaseJunitTest {
	
    @Test
    public void testcase(){
    	
    }
    
}
