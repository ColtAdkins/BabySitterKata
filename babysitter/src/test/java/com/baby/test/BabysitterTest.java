package com.baby.test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.baby.Babysitter;

public class BabysitterTest {

	//Instantiate Babysitter class
	Babysitter b = new Babysitter();
	
	//Calculates pay for 5 hours, asserts that it equals $60
	@Test
	public void calculatePayForFiveHours() {
		b.setBeginDay(13);
		b.setEndDay(13);
		b.setHourBegan(17);
		b.setHourEnd(22);
		int pay = b.calculatePay(b.getHourBegan(), b.getHourEnd());
		assertEquals(60, pay);
	}
	//Calculates pay for 11 hours, asserts that it equals $140
	@Test
	public void calculatePayForElevenHours() {
		b.setBeginDay(13);
		b.setEndDay(14);
		b.setHourBegan(17);
		b.setHourEnd(4);
		int pay = b.calculatePay(b.getHourBegan(), b.getHourEnd());
		assertEquals(140, pay);
	}
	//Calculates pay for 4 hours, asserts that it equals $64
	@Test
	public void calculatePayForMidnightShift() {
		b.setBeginDay(14);
		b.setEndDay(14);
		b.setHourBegan(0);
		b.setHourEnd(4);
		int pay = b.calculatePay(b.getHourBegan(), b.getHourEnd());
		assertEquals(64, pay);
	}
	//Calculates pay for 1 hour, asserts that it equals $16
	@Test
	public void calculatePayForOneHourThreeToFour() {
		b.setBeginDay(14);
		b.setEndDay(14);
		b.setHourBegan(3);
		b.setHourEnd(4);
		int pay = b.calculatePay(b.getHourBegan(), b.getHourEnd());
		assertEquals(16, pay);
	}
	//Calculates pay for 6 hours, asserts that it equals $80
	@Test
	public void calculatePayFromBedtimeToFour() {
		b.setBeginDay(13);
		b.setEndDay(14);
		b.setHourBegan(22);
		b.setHourEnd(4);
		int pay = b.calculatePay(b.getHourBegan(), b.getHourEnd());
		assertEquals(80, pay);
	}
}
