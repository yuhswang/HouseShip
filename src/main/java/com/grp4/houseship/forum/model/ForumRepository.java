package com.grp4.houseship.forum.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.grp4.houseship.member.model.Member;

public interface ForumRepository extends JpaRepository<Forum, Integer> {


	List<Forum> findByMember(Member member);
	
//	List<Forum> findByMessage()

}