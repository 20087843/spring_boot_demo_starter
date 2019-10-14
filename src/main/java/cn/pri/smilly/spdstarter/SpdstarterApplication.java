package cn.pri.smilly.spdstarter;

import cn.pri.smilly.spdstarter.config.EnableDemoConfiguration;
import cn.pri.smilly.spdstarter.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDemoConfiguration
public class SpdstarterApplication implements CommandLineRunner {
	@Autowired
	private DemoService demoService;

	public static void main(String[] args) {
		SpringApplication.run(SpdstarterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		demoService.print();
	}
}
