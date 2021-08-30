package com.bit.x4.model.dao;

import com.bit.x4.model.vo_dto_entity.Member2;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member2, Integer> {

}