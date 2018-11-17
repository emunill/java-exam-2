package com.privalia.springbootexam;

import com.privalia.springbootexam.services.CompanyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class SpringbootExamApplication implements ApplicationRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringbootExamApplication.class);

	@Autowired
	private CompanyService companyService;


	public static void main(String[] args) {
		SpringApplication.run(SpringbootExamApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {

		LOGGER.info("*********************************************");
		LOGGER.info("* Privalia SpringBoot exam by Eduard Munill *");
		LOGGER.info("*********************************************");

		companyService.loadData();
	}
}
