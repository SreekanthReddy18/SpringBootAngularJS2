package com.appdirect.user.configuration;

import javax.servlet.Filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class WebConfig{

	@Bean
	public Filter cORSFilter(){
		return new CORSFilter();
	}
	
	/*@Bean
	public YakshopWebMvcConfigurerAdapter yakshopWebMvcConfigurerAdapter(){
		return new YakshopWebMvcConfigurerAdapter();
	}*/
}
