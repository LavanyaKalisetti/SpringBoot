package com.nt.test;

import com.nt.comp.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyPatternTest {
	public static void main(String[] args) {
		Flipkart fpkt=FlipkartFactory.getInstance("dtdc");
		String resultMsg=fpkt.shopping(new String[] {"shirt","trouser"}, new double[] {5000.0,6000.0});
		System.out.println(resultMsg);
	}

}
