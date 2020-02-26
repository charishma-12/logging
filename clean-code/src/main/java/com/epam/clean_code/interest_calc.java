package com.epam.clean_code;

public class interest_calc {
	public int amount,time;
	float rate;
	interest_calc(int x,int y,float z){
		amount=x;
		time=y;
		rate=z;
	}
	public float simple_interest() {
		float result;
		result=(amount*time*rate)/100;
		return result;
	}
	public float compund_interest() {
		float result;
		float val=(float)Math.pow((double)(1+rate/100),(double)time);
		result=amount*(val);
		return result;
	}
}
