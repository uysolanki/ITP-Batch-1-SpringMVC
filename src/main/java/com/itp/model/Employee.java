package com.itp.model;

public class Employee {
private int eno;
private String ename;
private double sal;
private String desg;

public Employee() {}
public Employee(int eno, String ename, double sal, String desg) {
	this.eno = eno;
	this.ename = ename;
	this.sal = sal;
	this.desg = desg;
}
public int getEno() {
	return eno;
}
public void setEno(int eno) {
	this.eno = eno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
public String getDesg() {
	return desg;
}
public void setDesg(String desg) {
	this.desg = desg;
}

@Override
public String toString() {
	return "Employee [eno=" + eno + ", ename=" + ename + ", sal=" + sal + ", desg=" + desg + "]";
}


}
