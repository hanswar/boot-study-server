package com.hans.example.bootstudy.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitCycleQuiz {

	@BeforeEach
	public void beforeEach() {
		System.out.println("Hello!");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("Bye!");
	}
	
	@Test
	public void junitQuiz3() {
		System.out.println("This is first text");
	}
	
	@Test
	public void junitQuiz4() {
		System.out.println("This is second text");
	}
}
