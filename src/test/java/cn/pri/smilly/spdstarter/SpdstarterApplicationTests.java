package cn.pri.smilly.spdstarter;

import cn.pri.smilly.spdstarter.config.EnableDemoConfiguration;
import cn.pri.smilly.spdstarter.service.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableDemoConfiguration
public class SpdstarterApplicationTests {
	@Autowired
	private DemoService demoService;

	@Test
	public void testPrint() {
		demoService.print();
	}

}
