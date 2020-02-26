package com.epam.clean_code;

public class house_cons {
	float area;
	int material_range;
	public house_cons(float x,int type) {
		area=x;
		material_range=type;
	}
	public float calc_cost() {
		if(material_range==1) {
			return area*1200;
		}
		else if(material_range==2) {
			return area*1500;
		}
		else if(material_range==3) {
			return area*1800;
		}
		return area*2500;
	}
}
