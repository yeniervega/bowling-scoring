package com.tenpinbowlingscoringapp.entity;

public class PinfallPrinter extends Printer {

	@Override
	public void print(Object object) {
		Frame frame = (Frame) object;
		if (frame.getFirstPinfall() == "X" && (frame.getThirdPinfall() == null || frame.getThirdPinfall() == "")) {
			System.out.println("\t\t" + frame.getFirstPinfall());
		} else {
			System.out.println("\t" + frame.getFirstPinfall());
		}
		if (frame.getSecondPinfall() != null && frame.getSecondPinfall() != "") {
			System.out.println("\t" + frame.getSecondPinfall());
		}
		if (frame.getThirdPinfall() != null && frame.getThirdPinfall() != "") {
			System.out.println("\t" + frame.getThirdPinfall());
		}
	}
}
