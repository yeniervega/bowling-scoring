package com.tenpinbowlingscoringapp;

import org.junit.jupiter.api.Test;

public class BowlingScoreApplicationTest {
	
	String[] args;
	
	@Test
	void MainTest() {
		args=new String[10];
		args[0]="filePath";
		BowlingScoreApplication.main(args);
	}

}
