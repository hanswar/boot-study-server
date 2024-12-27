package com.hans.example.bootstudy.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hans.example.bootstudy.entity.Member;
import com.hans.example.bootstudy.service.TestService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TestController {

	private static final Logger log = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	TestService testService;
	
	@GetMapping("/test")
	public List<Member> getAllMembers() {
		log.info("여기 들어왔슈!");
		List<Member> members = testService.getAllMembers();
		for(Member member:members) {
			
		}
		return members;
	}
}
