package com.scodeen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scodeen.entity.City;

public interface CityRepo extends JpaRepository<City, Integer>{

}
