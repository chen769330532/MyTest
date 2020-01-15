package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		ArrayList<String> arrayList = new ArrayList<>();
		if(arrayList instanceof List){
			System.out.println("是的,没错");
		}
	}

}
