package com.sb.pojo;

public class Student {
	
	Integer sid;
	String name;
	String course;
	
	public Student() {
		super();
		
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", course=" + course + "]";
	}
	
}
