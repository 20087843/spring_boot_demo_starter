package cn.pri.smilly.spdstarter.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.smilly.demo")
@Data
public class DemoProperties {
    public String name;
    public int age;
    public String area;
}
