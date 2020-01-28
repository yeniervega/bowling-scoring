package com.tenpinbowlingscoringapp.entity;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PinfallPrinterTest {

	List<Frame> frames;
	List<Frame> frames1;
	List<Frame> frames2;
	List<Frame> frames3;
	
	@BeforeEach
	void preLoad() {

		Frame frame;
		frames = new ArrayList<Frame>();
		List<FrameWrapper> frameWrappers = new ArrayList<FrameWrapper>();
		frameWrappers.add(new FrameWrapper("X"));
		frameWrappers.add(new FrameWrapper("7", "/"));
		frameWrappers.add(new FrameWrapper("9", "0"));
		frameWrappers.add(new FrameWrapper("X"));
		frameWrappers.add(new FrameWrapper("0", "8"));
		frameWrappers.add(new FrameWrapper("8", "/"));
		frameWrappers.add(new FrameWrapper("f", "6"));
		frameWrappers.add(new FrameWrapper("X"));
		frameWrappers.add(new FrameWrapper("X"));
		frameWrappers.add(new FrameWrapper("X", "8", "1"));

		for (FrameWrapper frameWrapper : frameWrappers) {

			frame = new Frame();
			frame.setFirstPinfall(frameWrapper.getFirstPinfall());
			if (frameWrapper.getSecondPinfall() != null) {
				frame.setSecondPinfall(frameWrapper.getSecondPinfall());
			}
			if (frameWrapper.getThirdPinfall() != null) {
				frame.setThirdPinfall(frameWrapper.getThirdPinfall());
			}
			frames.add(frame);
		}

		List<Frame> frames1 = new ArrayList<Frame>();
		List<FrameWrapper> frameWrappers1 = new ArrayList<FrameWrapper>();
		frameWrappers1.add(new FrameWrapper("X"));
		frameWrappers1.add(new FrameWrapper("X"));
		frameWrappers1.add(new FrameWrapper("X"));
		frameWrappers1.add(new FrameWrapper("X"));
		frameWrappers1.add(new FrameWrapper("X"));
		frameWrappers1.add(new FrameWrapper("X"));
		frameWrappers1.add(new FrameWrapper("X"));
		frameWrappers1.add(new FrameWrapper("X"));
		frameWrappers1.add(new FrameWrapper("X"));
		frameWrappers1.add(new FrameWrapper("X", "X", "X"));

		for (FrameWrapper frameWrapper : frameWrappers1) {

			frame = new Frame();
			frame.setFirstPinfall(frameWrapper.getFirstPinfall());
			if (frameWrapper.getSecondPinfall() != null) {
				frame.setSecondPinfall(frameWrapper.getSecondPinfall());
			}
			if (frameWrapper.getThirdPinfall() != null) {
				frame.setThirdPinfall(frameWrapper.getThirdPinfall());
			}
			frames1.add(frame);
		}

		frames2 = new ArrayList<Frame>();
		List<FrameWrapper> frameWrappers2 = new ArrayList<FrameWrapper>();
		frameWrappers2.add(new FrameWrapper("0", "0"));
		frameWrappers2.add(new FrameWrapper("0", "0"));
		frameWrappers2.add(new FrameWrapper("0", "0"));
		frameWrappers2.add(new FrameWrapper("0", "0"));
		frameWrappers2.add(new FrameWrapper("0", "0"));
		frameWrappers2.add(new FrameWrapper("0", "0"));
		frameWrappers2.add(new FrameWrapper("0", "0"));
		frameWrappers2.add(new FrameWrapper("0", "0"));
		frameWrappers2.add(new FrameWrapper("0", "0"));
		frameWrappers2.add(new FrameWrapper("0", "0"));

		for (FrameWrapper frameWrapper : frameWrappers2) {

			frame = new Frame();
			frame.setFirstPinfall(frameWrapper.getFirstPinfall());
			if (frameWrapper.getSecondPinfall() != null) {
				frame.setSecondPinfall(frameWrapper.getSecondPinfall());
			}
			if (frameWrapper.getThirdPinfall() != null) {
				frame.setThirdPinfall(frameWrapper.getThirdPinfall());
			}
			frames2.add(frame);
		}

		frames3 = new ArrayList<Frame>();
		List<FrameWrapper> frameWrappers3 = new ArrayList<FrameWrapper>();
		frameWrappers3.add(new FrameWrapper("X"));
		frameWrappers3.add(new FrameWrapper("7", "/"));
		frameWrappers3.add(new FrameWrapper("9", "0"));
		frameWrappers3.add(new FrameWrapper("X"));
		frameWrappers3.add(new FrameWrapper("0", "8"));
		frameWrappers3.add(new FrameWrapper("8", "/"));
		frameWrappers3.add(new FrameWrapper("f", "6"));
		frameWrappers3.add(new FrameWrapper("X"));
		frameWrappers3.add(new FrameWrapper("X"));
		frameWrappers3.add(new FrameWrapper("X", "8", "1"));

		for (FrameWrapper frameWrapper : frameWrappers) {

			frame = new Frame();
			frame.setFirstPinfall(frameWrapper.getFirstPinfall());
			if (frameWrapper.getSecondPinfall() != null) {
				frame.setSecondPinfall(frameWrapper.getSecondPinfall());
			}
			if (frameWrapper.getThirdPinfall() != null) {
				frame.setThirdPinfall(frameWrapper.getThirdPinfall());
			}
			frames3.add(frame);
		}
	}

	@Test
	void print() {
		
		PinfallPrinter pintfallPrinter=new PinfallPrinter();
		pintfallPrinter.print(frames);
	}
}
