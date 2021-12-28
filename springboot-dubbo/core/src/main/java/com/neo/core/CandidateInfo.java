package com.neo.core;

import java.io.Serializable;

/**
 * Interface to define the state to be stored in ClientInfo objects
 * 
 * @author Rem
 *
 */
public class CandidateInfo implements Serializable {
	public static final String MALE				= "M";
	public static final String FEMALE				= "F";

	public CandidateInfo(String name, String sex, int age, int salary, String location) {
		this.name = name;
		this.gender = sex;
		this.age = age;
		this.expectedSalary = salary;
		this.location = location;
	}

	public CandidateInfo() {}

	/**
	 * Public fields are used as modern best practice argues that use of set/get
	 * methods is unnecessary as (1) set/get makes the field mutable anyway, and
	 * (2) set/get introduces additional method calls, which reduces performance.
	 */
	private String name;
	private String gender;
	private int age;
	private int expectedSalary;
	private String location;


	public static String getMALE() {
		return MALE;
	}

	public static String getFEMALE() {
		return FEMALE;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return expectedSalary;
	}

	public void setSalary(int expectedSalary) {
		this.expectedSalary = expectedSalary;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
