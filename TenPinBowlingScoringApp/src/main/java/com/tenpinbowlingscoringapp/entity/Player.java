package com.tenpinbowlingscoringapp.entity;

import java.util.List;

import com.tenpinbowlingscoringapp.useful.UsefulClass;

public class Player {

	private String name;
	private List<Frame> frames;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Frame> getFrames() {
		return frames;
	}

	public void setFrames(List<Frame> frames) {
		this.frames = frames;
	}
	
	public void calculationScore() {
		Integer score = 0;
		Integer pinfallsSummationPerFrame;
		Integer strikeOrSpareBonification;
		for (int i = 0; i < frames.size(); i++) {
			pinfallsSummationPerFrame = 0;
			strikeOrSpareBonification = 0;
			Frame currentFrame = frames.get(i);
			if (i < frames.size() - 1
					&& (currentFrame.getFirstPinfall() == "X" || currentFrame.getSecondPinfall() == "//")) {
				strikeOrSpareBonification = getStrikeOrSpareBonification(i);
			}
			pinfallsSummationPerFrame = getPinfallsSummationPerFrame(currentFrame);
			score = score + pinfallsSummationPerFrame + strikeOrSpareBonification;
			frames.get(i).setScore(score);
		}
	}
	
	 Integer getStrikeOrSpareBonification( Integer currentPosition) {
		Integer strikeOrSpareBonification = 0;
		Frame currentFrame = frames.get(currentPosition);
		String nextFrameFirstPinfall = frames.get(currentPosition + 1).getFirstPinfall();
		strikeOrSpareBonification = UsefulClass.getRealValuePinfall(nextFrameFirstPinfall);
		if (currentFrame.getFirstPinfall() == "X") {
			if (nextFrameFirstPinfall == "X") {
				String secondFrameFirstPinfall = frames.get(currentPosition + 2).getFirstPinfall();
				strikeOrSpareBonification += UsefulClass.getRealValuePinfall(secondFrameFirstPinfall);
			} else if (frames.get(currentPosition + 1).getSecondPinfall() == "//") {
				strikeOrSpareBonification = 10;
			} else {
				String nextFrameSecondPinfall = frames.get(currentPosition + 1).getSecondPinfall();
				strikeOrSpareBonification += UsefulClass.getRealValuePinfall(nextFrameSecondPinfall);
			}
		}
		return strikeOrSpareBonification;
	}
	
	 Integer getPinfallsSummationPerFrame(Frame frame) {
		Integer summation = 0;
		Integer realFirstPinfall = UsefulClass.getRealValuePinfall(frame.getFirstPinfall());
		Integer realSecondPinfall = UsefulClass.getRealValuePinfall(frame.getSecondPinfall());
		if (realSecondPinfall == -1) {
			realSecondPinfall = 10 - realFirstPinfall;
		}
		Integer realThirdPinfall = UsefulClass.getRealValuePinfall(frame.getThirdPinfall());
		summation = realFirstPinfall + realSecondPinfall + realThirdPinfall;
		return summation;
	}
}
