package com.hans.example.bootstudy.test;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class JUnitTest {

	@DisplayName("1 + 2는 3이다")
	@Test
	public void junitTest() {
		int a = 1;
		int b = 2;
		int sum = 3;
		
		Assertions.assertThat(sum).isEqualTo(a+b);
	}
	
}
