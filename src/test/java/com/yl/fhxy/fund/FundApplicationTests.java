package com.yl.fhxy.fund;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.SpringVersion;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class FundApplicationTests {

	@Test
	void contextLoads() {

		System.out.println(SpringVersion.getVersion());
		System.out.println(SpringBootVersion.getVersion());
	}

}
