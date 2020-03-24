package com.test.circle.ci.circleci;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CircleCiApplicationTests {

	@Test
	void contextLoads() {
		assertEquals("test","tester");
	}

}
