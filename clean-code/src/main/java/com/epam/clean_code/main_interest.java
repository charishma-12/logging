package com.epam.clean_code;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
public class main_interest {
	private static final Logger LOGGER=LogManager.getLogger(App.class);
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		LOGGER.info("Enter values for principal Amount,time,rate of interest");
		int amount=in.nextInt();
		int time=in.nextInt();
		float rate=in.nextFloat();
		LOGGER.info("Entered amount is : "+amount);
		LOGGER.info("Entered period of  time is:"+time);
		LOGGER.info("Entered rate of interest is :"+rate);
		interest_calc c=new interest_calc(amount,time,rate);
		LOGGER.info("Simple interest is : "+c.simple_interest());
		LOGGER.info("Compound Interest is : "+c.compund_interest());
		in.close();
	}
}
