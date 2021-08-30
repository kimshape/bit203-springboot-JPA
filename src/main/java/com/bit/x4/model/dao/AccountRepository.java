package com.bit.x4.model.dao;

import com.bit.x4.model.vo_dto_entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {
List<Account> findByusername(@Param("name") String name);
}
