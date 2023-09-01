package com.kiranacademy.warCurrentUR;

public class Soldier {
private int age;
private String loc;
private Gun Gun;
public Soldier(int age, String loc, Gun gun) {
	super();
	this.age = age;
	this.loc = loc;
	Gun = gun;
}
public Soldier() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Soldier [age=" + age + ", loc=" + loc + ", Gun=" + Gun + "]";
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}
public Gun getGun() {
	return Gun;
}
public void setGun(Gun gun) {
	Gun = gun;
}

}
