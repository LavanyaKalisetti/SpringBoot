package com.nt.sbeans;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component("ssBat")

public class SSBat implements ICricketBat {
	
	public SSBat() {
		System.out.println("SGBat::o-param constructor");
	}
	
	@Override
	public int scoreRuns() {
		System.out.println("SSBat.scoreRuns()");
		int score=new Random().nextInt(200);
		return score;

}
}
