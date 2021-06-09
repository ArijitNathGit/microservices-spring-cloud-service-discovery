package com.arijit.microservices.moviecatalogservice.configs;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class MovieConfigurations {

	/* The @LoadBalanced annotation allows the Eureka client to cache the API Calls. Such that if the Eureka server goes down, it can use the cache to call the rest APIs 
	 *  
	 * 
	 * */
	
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	@LoadBalanced
	public WebClient.Builder getWebclientBuilder() {
		return WebClient.builder();
	}
}
