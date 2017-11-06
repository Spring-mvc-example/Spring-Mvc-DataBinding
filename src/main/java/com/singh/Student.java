package com.singh;

import java.util.Date;
import java.util.List;

public class Student {
	private String studentname;
	private String studenthobby;
	private long studentmobile;
	private List<String> studentskill;
	private Date studentdob;

	public Date getStudentdob() {
		return studentdob;
	}

	public void setStudentdob(Date studentdob) {
		this.studentdob = studentdob;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getStudenthobby() {
		return studenthobby;
	}

	public void setStudenthobby(String studenthobby) {
		this.studenthobby = studenthobby;
	}

	public long getStudentmobile() {
		return studentmobile;
	}

	public void setStudentmobile(long studentmobile) {
		this.studentmobile = studentmobile;
	}

	public List<String> getStudentskill() {
		return studentskill;
	}

	public void setStudentskill(List<String> studentskill) {
		this.studentskill = studentskill;
	}

}
