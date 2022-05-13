package tn.esprit.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TimesheetSpringBootCoreDataJpaMvcRestApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("test");
		String st1="test";
		assertEquals("test", st1);
	}

}
