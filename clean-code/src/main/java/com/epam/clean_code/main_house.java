package com.epam.clean_code;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class main_house {
	private static final Logger LOGGER=LogManager.getLogger(App.class);
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		LOGGER.info("enter area of the House and material Type required among\n1.standard\n2.above standard\n3.high standard\n4.high standard and automated");
		float area=in.nextFloat();
		int type=in.nextInt();
		house_cons h=new house_cons(area,type);
		LOGGER.info("Entered area of the house is :"+area+"\nChosen type is : "+type+"\nTotal cost is : "+h.calc_cost());
		in.close();
	}

}
