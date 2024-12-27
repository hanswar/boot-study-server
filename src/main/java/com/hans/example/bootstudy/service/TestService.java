package com.hans.example.bootstudy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hans.example.bootstudy.entity.Member;
import com.hans.example.bootstudy.repo.MemberRepository;

@Service
public class TestService {

	@Autowired
	MemberRepository memberRepository;
	
	public List<Member> getAllMembers() {
		return memberRepository.findAll();
	}
}
