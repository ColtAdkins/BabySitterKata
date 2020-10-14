package com.baby;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

/*Babysitter class that's used in our BabySitterTest class, I've included LocalDateTime to determine the total hours worked between dates
 * 
 * Colton Adkins 10/14/2020
 */
public class Babysitter {
	
	//Getters and setters for the begin and end dates
	private Integer beginDay;
	private Integer endDay;
	private Integer hourBegan;
	private Integer hourEnd;

	public Integer getBeginDay() {
		return beginDay;
	}

	public void setBeginDay(Integer beginDay) {
		this.beginDay = beginDay;
	}

	public Integer getEndDay() {
		return endDay;
	}

	public void setEndDay(Integer endDay) {
		this.endDay = endDay;
	}

	public Integer getHourBegan() {
		return hourBegan;
	}

	public void setHourBegan(Integer hourBegan) {
		this.hourBegan = hourBegan;
	}

	public Integer getHourEnd() {
		return hourEnd;
	}

	public void setHourEnd(Integer hourEnd) {
		this.hourEnd = hourEnd;
	}
	
	//Method used in our test class that will determine the rate at which the babysitter is paid.
	public Integer calculatePay(Integer hourStart, Integer hourEnd) {
		//LocalDateTime that inputs the begin and end days as well as hours.
		LocalDateTime start = LocalDateTime.of(2020, Month.OCTOBER, beginDay, hourBegan, 0);
		LocalDateTime end = LocalDateTime.of(2020, Month.OCTOBER, endDay, hourEnd, 0);
		
		//Total hours worked
		System.out.println("Hours worked: " + Duration.between(start, end).toHours());
		
		long hoursWorked = Duration.between(start, end).toHours();
		Integer pay = 0;
		Integer bedTime = 22;
		Integer midnight = 24;
		
		//Set hourStart to midnights value of 24, this is an issue with LocalDateTime setting midnight to 0
		if(hourStart == 0) {
			hourStart = midnight;
		}
		//Loop through the total hours worked
		for(int i = 1; hoursWorked>=i; i++) {
			//increment hourStart to accommodate for different rates the babysitter will be paid
			hourStart++;
			
			//If the day does not begin on the following day October 14th and the hourStart is prior to bedtime, add 12 for each hour
			if(hourStart <= bedTime && (beginDay != 14)) {
				pay += 12;
			//If the day does not begin on October 14th and hourStart is prior to midnight, add 8 for each hour
			} else if (hourStart <= midnight && (beginDay != 14)) {
				pay += 8;
			//If neither of the conditions are true, the begin day must be Oct 14th and is therefore past midnight
			} else {
				pay += 16;
			}
		}
		return pay;
	}
	
}
