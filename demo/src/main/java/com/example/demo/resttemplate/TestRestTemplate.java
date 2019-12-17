package com.example.demo.resttemplate;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class TestRestTemplate {

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> postForEntity = restTemplate.postForEntity("http://localhost:8084/hello", "a", String.class);
		String body = postForEntity.getBody();
		System.out.println(body);
		MediaType contentType = postForEntity.getHeaders().getContentType();
		System.out.println(contentType.getType());
	}
}
