package com.perscholas.springboot_basic_web;
import com.yrrhelp.*;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.perscholas.springboot_basic_web.filters.AuthenticationFilter;

@SpringBootApplication
@ComponentScan("com.*")
@ComponentScan("tn.*")
public class ADModuleSpringBootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ADModuleSpringBootWebApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean<AuthenticationFilter> authFilter() {
		FilterRegistrationBean<AuthenticationFilter> registrationBean = 
				new FilterRegistrationBean<>();
		registrationBean.setFilter(new AuthenticationFilter());
		registrationBean.setUrlPatterns(Arrays.asList(new String[] {"/homePage", "/aboutPage", 
				"/expenseForm", "/createExpense", "/allExpenses"}));

		return registrationBean;
	}
}
