import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import com.cn.storm.pojo.User;
import com.cn.storm.service.IUserService;
@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {
	 private static Logger logger = Logger.getLogger(TestMyBatis.class);
	 private ApplicationContext ac = null;
	 
	 @Resource
	 private IUserService userService = null;
	 @Test
	 public void test1() {
		 User user = userService.getUserById(1);
		 logger.info(JSON.toJSONString(user));
	 }
}
