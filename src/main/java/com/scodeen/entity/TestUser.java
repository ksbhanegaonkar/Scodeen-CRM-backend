package com.scodeen.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_tbl")
public class TestUser extends BaseIdEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;

	@Column(name = "age")
	private int age;
	@Column(name = "name")
	private String name;

	public TestUser() {

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}