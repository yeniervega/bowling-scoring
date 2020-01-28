package com.tenpinbowlingscoringapp.entity;

public class FrameWrapper {

	private String firstPinfall;
	private String secondPinfall;
	private String thirdPinfall;

	public FrameWrapper(String firstPinfall, String secondPinfall, String thirdPinfall) {
		super();
		this.firstPinfall = firstPinfall;
		this.secondPinfall = secondPinfall;
		this.thirdPinfall = thirdPinfall;
	}

	public FrameWrapper(String firstPinfall, String secondPinfall) {
		super();
		this.firstPinfall = firstPinfall;
		this.secondPinfall = secondPinfall;
	}	

	public FrameWrapper(String firstPinfall) {
		super();
		this.firstPinfall = firstPinfall;
	}

	public String getFirstPinfall() {
		return firstPinfall;
	}

	public void setFirstPinfall(String firstPinfall) {
		this.firstPinfall = firstPinfall;
	}

	public String getSecondPinfall() {
		return secondPinfall;
	}

	public void setSecondPinfall(String secondPinfall) {
		this.secondPinfall = secondPinfall;
	}

	public String getThirdPinfall() {
		return thirdPinfall;
	}

	public void setThirdPinfall(String thirdPinfall) {
		this.thirdPinfall = thirdPinfall;
	}

}
