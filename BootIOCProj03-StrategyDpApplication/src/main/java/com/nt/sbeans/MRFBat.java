package com.nt.sbeans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("mrfBat")
public class MRFBat implements ICricketBat{
	
	public MRFBat() {
		System.out.println("MRFBat::o-param constructor");
	}
	
	@Override
	public int scoreRuns() {
		System.out.println("MRFBat.scoreRuns()");
		int score=new Random().nextInt(200);
		return score;
	}

}
