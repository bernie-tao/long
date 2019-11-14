package com.tao.pojo;

import java.io.Serializable;

public class Syb implements Serializable{
private int id;
private String name;
private String pwd;
private String student_id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getStudent_id() {
	return student_id;
}
public void setStudent_id(String student_id) {
	this.student_id = student_id;
}
@Override
public String toString() {
	return "Syb [id=" + id + ", name=" + name + ", pwd=" + pwd + ", student_id=" + student_id + "]";
}
public Syb(int id, String name, String pwd, String student_id) {
	super();
	this.id = id;
	this.name = name;
	this.pwd = pwd;
	this.student_id = student_id;
}
public Syb(){}
}
