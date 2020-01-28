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
					&& (currentFrame.getFirstPinfall() == "X" || currentFrame.getSecondPinfall() == "/")) {
				strikeOrSpareBonification = getStrikeOrSpareBonification(i);
			}
			pinfallsSummationPerFrame = UsefulClass.getPinfallsSummationPerFrame(currentFrame);
			score = score + pinfallsSummationPerFrame + strikeOrSpareBonification;
			frames.get(i).setScore(score);
		}
	}

	Integer getStrikeOrSpareBonification(Integer currentPosition) {
		Integer nextPosition = currentPosition + 1;
		Integer strikeOrSpareBonification = 0;
		Frame currentFrame = frames.get(currentPosition);
		String nextFrameFirstPinfall = frames.get(nextPosition).getFirstPinfall();
		strikeOrSpareBonification = UsefulClass.getRealValuePinfall(nextFrameFirstPinfall);
		if (currentFrame.getFirstPinfall() == "X") {
			if (nextFrameFirstPinfall == "X" && ((nextPosition) < frames.size() - 1)) {
				String secondFrameFirstPinfall = frames.get(currentPosition + 2).getFirstPinfall();
				strikeOrSpareBonification += UsefulClass.getRealValuePinfall(secondFrameFirstPinfall);
			} else if (frames.get(nextPosition).getSecondPinfall() == "/") {
				strikeOrSpareBonification = 10;
			} else {
				String nextFrameSecondPinfall = frames.get(nextPosition).getSecondPinfall();
				strikeOrSpareBonification += UsefulClass.getRealValuePinfall(nextFrameSecondPinfall);
			}
		}
		return strikeOrSpareBonification;
	}
}
