package com.tenpinbowlingscoringapp.transformdata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.tenpinbowlingscoringapp.entity.Frame;
import com.tenpinbowlingscoringapp.entity.Player;
import com.tenpinbowlingscoringapp.entity.Wrapper;
import com.tenpinbowlingscoringapp.transformdata.FrameTransformData;

public class FrameTransformDataTest {

	List<Player> players;
	List<Player> players1;
	List<Player> players3;
	List<Player> players4;
	List<Player> players5;
	List<Player> players6;
	List<Player> players7;

	

	@BeforeEach
	void inital() {
		List<Wrapper> wrappers = new ArrayList<Wrapper>();
		wrappers.add(new Wrapper("Jeff", "10"));
		wrappers.add(new Wrapper("Jeff", "7"));
		wrappers.add(new Wrapper("Jeff", "3"));
		wrappers.add(new Wrapper("Jeff", "9"));
		wrappers.add(new Wrapper("Jeff", "0"));
		wrappers.add(new Wrapper("Jeff", "10"));
		wrappers.add(new Wrapper("Jeff", "0"));
		wrappers.add(new Wrapper("Jeff", "8"));
		wrappers.add(new Wrapper("Jeff", "8"));
		wrappers.add(new Wrapper("Jeff", "2"));
		wrappers.add(new Wrapper("Jeff", "f"));
		wrappers.add(new Wrapper("Jeff", "6"));
		wrappers.add(new Wrapper("Jeff", "10"));
		wrappers.add(new Wrapper("Jeff", "10"));
		wrappers.add(new Wrapper("Jeff", "10"));
		wrappers.add(new Wrapper("Jeff", "8"));
		wrappers.add(new Wrapper("Jeff", "1"));
		players = new ArrayList<Player>();

		List<Frame> frames;
		for (Wrapper wrap : wrappers) {
			frames = new ArrayList<Frame>();
			Player player = new Player();
			player.setName(wrap.getName());
			Frame frame = new Frame();
			frame.setFirstPinfall(wrap.getValue());
			frames.add(frame);
			player.setFrames(frames);
			players.add(player);
		}

		List<Wrapper> wrappers1 = new ArrayList<Wrapper>();
		wrappers1.add(new Wrapper("Carl", "10"));
		wrappers1.add(new Wrapper("Carl", "10"));
		wrappers1.add(new Wrapper("Carl", "10"));
		wrappers1.add(new Wrapper("Carl", "10"));
		wrappers1.add(new Wrapper("Carl", "10"));
		wrappers1.add(new Wrapper("Carl", "10"));
		wrappers1.add(new Wrapper("Carl", "10"));
		wrappers1.add(new Wrapper("Carl", "10"));
		wrappers1.add(new Wrapper("Carl", "10"));
		wrappers1.add(new Wrapper("Carl", "10"));
		wrappers1.add(new Wrapper("Carl", "10"));
		wrappers1.add(new Wrapper("Carl", "10"));
		players1 = new ArrayList<Player>();

		List<Frame> frames1;
		for (Wrapper wrap : wrappers1) {
			frames1 = new ArrayList<Frame>();
			Player player = new Player();
			player.setName(wrap.getName());
			Frame frame = new Frame();
			frame.setFirstPinfall(wrap.getValue());
			frames1.add(frame);
			player.setFrames(frames1);
			players1.add(player);
		}

		List<Wrapper> wrappers3 = new ArrayList<Wrapper>();
		wrappers3.add(new Wrapper("Jhon", "0"));
		wrappers3.add(new Wrapper("Jhon", "0"));
		wrappers3.add(new Wrapper("Jhon", "0"));
		wrappers3.add(new Wrapper("Jhon", "0"));
		wrappers3.add(new Wrapper("Jhon", "0"));
		wrappers3.add(new Wrapper("Jhon", "0"));
		wrappers3.add(new Wrapper("Jhon", "0"));
		wrappers3.add(new Wrapper("Jhon", "0"));
		wrappers3.add(new Wrapper("Jhon", "0"));
		wrappers3.add(new Wrapper("Jhon", "0"));
		wrappers3.add(new Wrapper("Jhon", "0"));
		wrappers3.add(new Wrapper("Jhon", "0"));
		wrappers3.add(new Wrapper("Jhon", "0"));
		wrappers3.add(new Wrapper("Jhon", "0"));
		wrappers3.add(new Wrapper("Jhon", "0"));
		wrappers3.add(new Wrapper("Jhon", "0"));
		wrappers3.add(new Wrapper("Jhon", "0"));
		wrappers3.add(new Wrapper("Jhon", "0"));
		wrappers3.add(new Wrapper("Jhon", "0"));
		wrappers3.add(new Wrapper("Jhon", "0"));
		players3 = new ArrayList<Player>();

		List<Frame> frames2;
		for (Wrapper wrap : wrappers3) {
			frames2 = new ArrayList<Frame>();
			Player player = new Player();
			player.setName(wrap.getName());
			Frame frame = new Frame();
			frame.setFirstPinfall(wrap.getValue());
			frames2.add(frame);
			player.setFrames(frames2);
			players3.add(player);
		}

		List<Wrapper> wrappers4 = new ArrayList<Wrapper>();
		wrappers4.add(new Wrapper("Jhon", "F"));
		wrappers4.add(new Wrapper("Jhon", "F"));
		wrappers4.add(new Wrapper("Jhon", "F"));
		wrappers4.add(new Wrapper("Jhon", "F"));
		wrappers4.add(new Wrapper("Jhon", "F"));
		wrappers4.add(new Wrapper("Jhon", "F"));
		wrappers4.add(new Wrapper("Jhon", "F"));
		wrappers4.add(new Wrapper("Jhon", "F"));
		wrappers4.add(new Wrapper("Jhon", "F"));
		wrappers4.add(new Wrapper("Jhon", "F"));
		wrappers4.add(new Wrapper("Jhon", "F"));
		wrappers4.add(new Wrapper("Jhon", "F"));
		wrappers4.add(new Wrapper("Jhon", "F"));
		wrappers4.add(new Wrapper("Jhon", "F"));
		wrappers4.add(new Wrapper("Jhon", "F"));
		wrappers4.add(new Wrapper("Jhon", "F"));
		wrappers4.add(new Wrapper("Jhon", "F"));
		wrappers4.add(new Wrapper("Jhon", "F"));
		wrappers4.add(new Wrapper("Jhon", "F"));
		wrappers4.add(new Wrapper("Jhon", "F"));
		players4 = new ArrayList<Player>();

		List<Frame> frames4;
		for (Wrapper wrap : wrappers4) {
			frames4 = new ArrayList<Frame>();
			Player player = new Player();
			player.setName(wrap.getName());
			Frame frame = new Frame();
			frame.setFirstPinfall(wrap.getValue());
			frames4.add(frame);
			player.setFrames(frames4);
			players4.add(player);
		}

		List<Wrapper> wrappers5 = new ArrayList<Wrapper>();
		wrappers5.add(new Wrapper("Jhon", "5"));
		wrappers5.add(new Wrapper("Jhon", "5"));
		wrappers5.add(new Wrapper("Jhon", "-1"));
		wrappers5.add(new Wrapper("Jhon", "5"));
		wrappers5.add(new Wrapper("Jhon", "5"));
		wrappers5.add(new Wrapper("Jhon", "5"));
		wrappers5.add(new Wrapper("Jhon", "5"));
		wrappers5.add(new Wrapper("Jhon", "5"));
		wrappers5.add(new Wrapper("Jhon", "5"));
		wrappers5.add(new Wrapper("Jhon", "5"));
		wrappers5.add(new Wrapper("Jhon", "5"));wrappers4.add(new Wrapper("Jhon", "F"));
		wrappers4.add(new Wrapper("Jhon", "F"));
		wrappers4.add(new Wrapper("Jhon", "F"));
		wrappers4.add(new Wrapper("Jhon", "F"));
		wrappers4.add(new Wrapper("Jhon", "F"));
		wrappers4.add(new Wrapper("Jhon", "F"));
		wrappers4.add(new Wrapper("Jhon", "F"));
		wrappers4.add(new Wrapper("Jhon", "F"));
		wrappers4.add(new Wrapper("Jhon", "F"));
		wrappers4.add(new Wrapper("Jhon", "F"));
		wrappers4.add(new Wrapper("Jhon", "F"));
		wrappers5.add(new Wrapper("Jhon", "5"));
		players5 = new ArrayList<Player>();

		List<Frame> frames5;
		for (Wrapper wrap : wrappers5) {
			frames5 = new ArrayList<Frame>();
			Player player = new Player();
			player.setName(wrap.getName());
			Frame frame = new Frame();
			frame.setFirstPinfall(wrap.getValue());
			frames5.add(frame);
			player.setFrames(frames5);
			players5.add(player);
		}
	}

	//Case1
	@Test
	void TransformData() throws Exception {	
		
		FrameTransformData fr = new FrameTransformData();
		Player result = fr.transformData(players);
		String resultShow="";
		String compare="X 7 / 9 0 X 0 8  8 / f 6 X X X 8 1 ";
		List<Frame> frames=result.getFrames();
		for(Frame frame:frames) {			
			String pinfall1=frame.getFirstPinfall()!=null?frame.getFirstPinfall():"";
			String pinfall2=frame.getSecondPinfall()!=null?frame.getSecondPinfall():"";
			String pinfall3=frame.getThirdPinfall()!=null?frame.getThirdPinfall():"";
			resultShow=resultShow+pinfall1+pinfall2+pinfall3;			
		}
		compare=compare.replace(" ", "");
		resultShow=resultShow.replace(" ", "");
		assertEquals(compare,resultShow);		
	}
	
	@Test
	void perfectScore() throws Exception {	
		
		FrameTransformData fr = new FrameTransformData();
		Player result = fr.transformData(players1);
		String resultShow="";
		String compare="X X X X X X X X X X X X";
		List<Frame> frames=result.getFrames();
		for(Frame frame:frames) {			
			String pinfall1=frame.getFirstPinfall()!=null?frame.getFirstPinfall():"";
			String pinfall2=frame.getSecondPinfall()!=null?frame.getSecondPinfall():"";
			String pinfall3=frame.getThirdPinfall()!=null?frame.getThirdPinfall():"";
			resultShow=resultShow+pinfall1+pinfall2+pinfall3;			
		}
		compare=compare.replace(" ", "");
		resultShow=resultShow.replace(" ", "");
		assertEquals(compare,resultShow);		
	}
	
	@Test
	void allZero() throws Exception {	
		
		FrameTransformData fr = new FrameTransformData();
		Player result = fr.transformData(players3);
		String resultShow="";
		String compare="0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0";
		List<Frame> frames=result.getFrames();
		for(Frame frame:frames) {			
			String pinfall1=frame.getFirstPinfall()!=null?frame.getFirstPinfall():"";
			String pinfall2=frame.getSecondPinfall()!=null?frame.getSecondPinfall():"";
			String pinfall3=frame.getThirdPinfall()!=null?frame.getThirdPinfall():"";
			resultShow=resultShow+pinfall1+pinfall2+pinfall3;			
		}
		compare=compare.replace(" ", "");
		resultShow=resultShow.replace(" ", "");
		assertEquals(compare,resultShow);		
	}
	
	@Test
	void allF() throws Exception {			
		FrameTransformData fr = new FrameTransformData();
		Player result = fr.transformData(players4);
		String resultShow="";
		String compare="F F F F F F F F F F F F F F F F F F F F";
		List<Frame> frames=result.getFrames();
		for(Frame frame:frames) {			
			String pinfall1=frame.getFirstPinfall()!=null?frame.getFirstPinfall():"";
			String pinfall2=frame.getSecondPinfall()!=null?frame.getSecondPinfall():"";
			String pinfall3=frame.getThirdPinfall()!=null?frame.getThirdPinfall():"";
			resultShow=resultShow+pinfall1+pinfall2+pinfall3;			
		}
		compare=compare.replace(" ", "");
		resultShow=resultShow.replace(" ", "");
		assertEquals(compare,resultShow);		
	}

}
