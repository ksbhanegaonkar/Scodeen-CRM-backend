package com.scodeen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scodeen.entity.TestUser;

public interface TestUserRepo extends JpaRepository<TestUser,Integer> {

}
