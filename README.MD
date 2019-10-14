### 原理
spring-boot启动的时候会找到starter jar包中的resources/META-INF/spring.factories文件，根据spring.factories文件中的配置，找到需要自动配置的类并加载到IOC容器中

### [源码分析](./source_analysis.html)

### 程序说明
1. @EnableDemoConfiguration 自动化配置加载条件，必须有一个类标注了此注解
2. DemoProperties 对应application.properties里面的 spring.smilly.demo.xxx 属性
3. DemoAutoConfiguration 设置自动配置的相关条件，和相关操作
4. spring.factories Spring Boot 

### 注意事项
1. pom.xml 文件中 goal 选择jar-no-fork，因为这里不需要main函数
2. @EnableDemoConfiguration 不是必须的，建议有这样一个注释，作为自动配置相关属性的入口
3. DemoService 不需要@Service，因为已经通过DemoAutoConfiguration注入spring容器了

### 测试应用
1. mvn install 将工程打包到本地 maven 库
2. 新建工程 pom.xml 引入当前项目
```xml
<dependency>
    <groupId>cn.pri.smilly</groupId>
    <artifactId>spdstarter</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```
3. 启动类标注 @EnableDemoConfiguration
```java
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
```
4. application.properties 配置 spring.smilly.demo.xxx 属性
```text
spring.smilly.demo.name=smilly
spring.smilly.demo.age=22
spring.smilly.demo.area=china
```
