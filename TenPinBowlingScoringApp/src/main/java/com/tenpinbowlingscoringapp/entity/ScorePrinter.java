package com.tenpinbowlingscoringapp.entity;

public class ScorePrinter extends Printer {

	@Override
	public void print(Object object) {
		Frame frame = (Frame) object;
		System.out.println("\t\t" + frame.getScore());		
	}
}
