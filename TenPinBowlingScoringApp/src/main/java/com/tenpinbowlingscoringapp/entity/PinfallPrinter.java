package com.tenpinbowlingscoringapp.entity;

import java.util.List;

public class PinfallPrinter extends Printer {

	@Override
	public void print(Object object) {

		String pinfalls = "Pinfalls";
		List<Frame> frames = (List<Frame>) object;
		for (Frame frame : frames) {
			if (frame.getFirstPinfall() == "X" && (frame.getThirdPinfall() == null || frame.getThirdPinfall() == "")) {
				pinfalls = pinfalls + "\t\t" + frame.getFirstPinfall();
			} else {
				pinfalls = pinfalls + "\t" + frame.getFirstPinfall();
			}
			if (frame.getSecondPinfall() != null && frame.getSecondPinfall() != "") {
				pinfalls = pinfalls + "\t" + frame.getSecondPinfall();
			}
			if (frame.getThirdPinfall() != null && frame.getThirdPinfall() != "") {
				pinfalls = pinfalls + "\t" + frame.getThirdPinfall();
			}
		}
		System.out.println(pinfalls);
	}
}
