package com.demo.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//import com.howtodoinjava.core.beans.DemoManager;
//import com.howtodoinjava.core.beans.DemoManagerImpl;

@Configuration
public class Cofiguration_Class {
	
	@Bean(name="sinfo")
    public Student12 getInfo() {
        return new Student12();
    }

}

