

package com.tenpinbowlingscoringapp.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.tenpinbowlingscoringapp.entity.Frame;
import com.tenpinbowlingscoringapp.entity.Player;

public class PlayerTest {

	Player player;
	Player player1;
	Player player2;
	Player player3;

	@BeforeEach
	void preLoad() {

		Frame frame;
		List<Frame> frames = new ArrayList<Frame>();
		player = new Player();
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
		player.setFrames(frames);		
		
		
		List<Frame> frames1 = new ArrayList<Frame>();
		player1 = new Player();
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
		frameWrappers1.add(new FrameWrapper("X","X","X"));

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
		player1.setFrames(frames1);
		
			List<Frame> frames2 = new ArrayList<Frame>();
		player2 = new Player();
		List<FrameWrapper> frameWrappers2 = new ArrayList<FrameWrapper>();
		frameWrappers2.add(new FrameWrapper("0","0"));
		frameWrappers2.add(new FrameWrapper("0","0"));
		frameWrappers2.add(new FrameWrapper("0","0"));
		frameWrappers2.add(new FrameWrapper("0","0"));
		frameWrappers2.add(new FrameWrapper("0","0"));
		frameWrappers2.add(new FrameWrapper("0","0"));
		frameWrappers2.add(new FrameWrapper("0","0"));
		frameWrappers2.add(new FrameWrapper("0","0"));
		frameWrappers2.add(new FrameWrapper("0","0"));
		frameWrappers2.add(new FrameWrapper("0","0"));

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
		player2.setFrames(frames2);
		
		
		List<Frame> frames3 = new ArrayList<Frame>();
		player3 = new Player();
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

		for (FrameWrapper frameWrapper : frameWrappers3) {

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
		player3.setFrames(frames3);
	}

	@Test
	void calculationScore() {
		player.calculationScore();
		String result = "";
		String expected = "20 39 48 66 74 84 90 120 148 167 ";
		for (Frame frame : player.getFrames()) {
			result = result + frame.getScore().toString() + " ";
		}
		assertEquals(expected, result);
	}
	
	@Test
	void calculationPerfectScore() {
		player1.calculationScore();
		String result = "";
		String expected = "30 60 90 120 150 180 210 240 270 300 ";
		for (Frame frame : player1.getFrames()) {
			result = result + frame.getScore().toString() + " ";
		}
		assertEquals(expected, result);
	}
	
	@Test
	void calculationZeroScore() {
		player2.calculationScore();
		String result = "";
		String expected = "0 0 0 0 0 0 0 0 0 0 ";
		for (Frame frame : player2.getFrames()) {
			result = result + frame.getScore().toString() + " ";
		}
		assertEquals(expected, result);
	}
	
	@Test
	void getStrikeOrSpareBonification() {
		Integer[] scores= new Integer[] {10,9,8,0,20,18};
		Integer[] positions=new Integer[] {0,1,3,5,7,8};
		Integer expected;
		for (int i = 0; i < positions.length; i++) {
			Integer value=player.getStrikeOrSpareBonification(positions[i]);
			expected=scores[i];
			assertEquals(expected, value);
		}		
	}
}