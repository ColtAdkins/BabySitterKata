package com.baby.test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.baby.Babysitter;

public class BabysitterTest {

	Babysitter b = new Babysitter();
	
	@Test
	public void calculatePayForFiveHours() {
		b.setBeginDay(13);
		b.setEndDay(13);
		b.setHourBegan(17);
		b.setHourEnd(22);
		int pay = b.calculatePay(b.getHourBegan(), b.getHourEnd());
		assertEquals(60, pay);
	}
	@Test
	public void calculatePayForElevenHours() {
		b.setBeginDay(13);
		b.setEndDay(14);
		b.setHourBegan(17);
		b.setHourEnd(4);
		int pay = b.calculatePay(b.getHourBegan(), b.getHourEnd());
		assertEquals(140, pay);
	}
	@Test
	public void calculatePayForMidnightShift() {
		b.setBeginDay(14);
		b.setEndDay(14);
		b.setHourBegan(0);
		b.setHourEnd(4);
		int pay = b.calculatePay(b.getHourBegan(), b.getHourEnd());
		assertEquals(64, pay);
	}
	@Test
	public void calculatePayForOneHourThreeToFour() {
		b.setBeginDay(14);
		b.setEndDay(14);
		b.setHourBegan(3);
		b.setHourEnd(4);
		int pay = b.calculatePay(b.getHourBegan(), b.getHourEnd());
		assertEquals(16, pay);
	}
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
