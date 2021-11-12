package com.wolken.wifi.DI;

public class Package {
private int amount;
private int data;
private int speed;
public void setAmount(int amount) {
	this.amount = amount;
}
public void setData(int data) {
	this.data = data;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
@Override
public String toString() {
	return "Package [amount=" + amount + ", data=" + data + ", speed=" + speed + "]";
}


}
