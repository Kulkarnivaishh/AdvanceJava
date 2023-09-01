package com.kiranacademy.warCurrentUR;

public class Gun {
private int countofBullets;
private String typeofGun;
public Gun(int countofBullets, String typeofGun) {
	super();
	this.countofBullets = countofBullets;
	this.typeofGun = typeofGun;
}
public Gun() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Gun [countofBullets=" + countofBullets + ", typeofGun=" + typeofGun + "]";
}
public int getCountofBullets() {
	return countofBullets;
}
public void setCountofBullets(int countofBullets) {
	this.countofBullets = countofBullets;
}
public String getTypeofGun() {
	return typeofGun;
}
public void setTypeofGun(String typeofGun) {
	this.typeofGun = typeofGun;
}


}
