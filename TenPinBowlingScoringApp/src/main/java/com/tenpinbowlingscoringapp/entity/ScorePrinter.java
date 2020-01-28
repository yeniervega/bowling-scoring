package com.tenpinbowlingscoringapp.entity;

import java.util.List;

public class ScorePrinter extends Printer {

	@Override
	public void print(Object object) {
		String score = "Score";
		List<Frame> frames = (List<Frame>) object;
		for (Frame frame : frames) {
			score = score + "\t\t" + frame.getScore();
		}
		System.out.println(score);		
	}
}
