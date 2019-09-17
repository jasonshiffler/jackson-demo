package com.shiffler.springbootdemo.jacksondemo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shiffler.springbootdemo.jacksondemo.entities.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.io.File;

@SpringBootApplication
public class JacksonDemoApplication {

	static Logger logger = LoggerFactory.getLogger(JacksonDemoApplication.class);

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(JacksonDemoApplication.class, args);
		ObjectMapper mapper = ctx.getBean("objectMapper",ObjectMapper.class);

		try {
			Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
			logger.info("The Student: {}", theStudent);

		}catch (Exception e){
			e.printStackTrace();
		}

	} //close method


}// close class
