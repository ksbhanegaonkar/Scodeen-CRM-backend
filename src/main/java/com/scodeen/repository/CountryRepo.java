package com.scodeen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scodeen.entity.Country;

public interface CountryRepo extends JpaRepository<Country, Integer>{

}
