package com.example.wen.springcourses;

public class Course {
	private String courseName;
	private int price;
	private String courseRoom;
	
	public Course(){
		
	}

	public Course(String courseName, int price, String courseRoom) {
		this.courseName = courseName;
		this.price = price;
		this.courseRoom = courseRoom;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCourseRoom() {
		return courseRoom;
	}

	public void setCourseRoom(String courseRoom) {
		this.courseRoom = courseRoom;
	}
	

}
