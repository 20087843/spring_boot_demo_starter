package cn.pri.smilly.spdstarter.service;

import cn.pri.smilly.spdstarter.config.DemoProperties;
import org.springframework.beans.factory.annotation.Autowired;

public class DemoService {
    @Autowired
    private DemoProperties demoProperties;

    public void print() {
        System.out.println("My name is " + demoProperties.getName() + ", I'm " + demoProperties + " years old now, and I live in " + demoProperties.getArea());
    }

}
