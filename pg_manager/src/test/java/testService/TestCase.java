package testService;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestCase {
	ApplicationContext ac=null;
	@Before
	public void beforeLoading(){
		String [] cfg =new String [] {"classpath*:META-INF/spring/spring-database.xml",
			    "classpath*:META-INF/spring/spring-mybatis.xml",
			    "classpath*:META-INF/spring/spring-resource.xml", "META-INF/spring/spring-service.xml"};
		 ac= new ClassPathXmlApplicationContext(cfg);
	}
	
	@Test
	public void Test2() {
		
		
	}
	

}
