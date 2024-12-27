package com.hans.example.bootstudy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hans.example.bootstudy.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

}
