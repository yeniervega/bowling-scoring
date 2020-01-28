package com.tenpinbowlingscoringapp.entity;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ScorePrinterTest {
	
	List<Frame> frames;
	
	@BeforeEach
	void preLoad() {
		
		Frame frame;	
		frames=new ArrayList<Frame>();
		List<Wrapper> frameWrappers = new ArrayList<Wrapper>();
		frameWrappers.add(new Wrapper(16));
		frameWrappers.add(new Wrapper(25));
		frameWrappers.add(new Wrapper(44));
		frameWrappers.add(new Wrapper(53));
		frameWrappers.add(new Wrapper(82));
		frameWrappers.add(new Wrapper(101));
		frameWrappers.add(new Wrapper(110));
		frameWrappers.add(new Wrapper(124));
		frameWrappers.add(new Wrapper(132));
		frameWrappers.add(new Wrapper(155));
		
		for (Wrapper frameWrapper : frameWrappers) {
			frame=new Frame();
			frame.setScore(frameWrapper.getScore());
			frames.add(frame);
		}
		
	}
	
	@Test
	void pint() {
		ScorePrinter scorePrinter=new ScorePrinter();
		scorePrinter.print(frames);
	}

}