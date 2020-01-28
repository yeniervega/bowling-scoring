package com.tenpinbowlingscoringapp.entity;

public class Wrapper {
	private String name;
	private String value;
	private String secondvalue;
	private Integer score;

	public Wrapper(Integer score) {
		super();
		this.score = score;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String getSecondvalue() {
		return secondvalue;
	}

	public void setSecondvalue(String secondvalue) {
		this.secondvalue = secondvalue;
	}

	public Wrapper(String name) {
		super();
		this.name = name;
	}

	public Wrapper(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}

	public Wrapper(String name, String value, String secondvalue) {
		super();
		this.name = name;
		this.value = value;
		this.secondvalue = secondvalue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
