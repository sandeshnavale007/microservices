package com.management.education.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
  class CommonConfiguration {

	
	@Bean
	public ObjectMapper getObjectMapper() {
		
		return new ObjectMapper();
	}
	
	

}
