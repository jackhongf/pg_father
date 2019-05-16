package base;


import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.vincent.hong.dao.authority.CustomerMapper;
import com.vincent.hong.model.authority.Customer;

public class TestCase1 extends BaseJunitTest {
	
	@Autowired
	private CustomerMapper mapper;
	
	@Test
	public void test1() {
		List<Customer> cusList = mapper.selectAll();	
		for(Customer  cus:cusList) {
			System.out.println("结果:"+cus.toString());
		}
	}
	
	
	
}
