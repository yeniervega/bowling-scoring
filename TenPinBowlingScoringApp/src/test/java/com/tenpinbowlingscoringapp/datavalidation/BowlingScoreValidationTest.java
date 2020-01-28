package com.tenpinbowlingscoringapp.datavalidation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.tenpinbowlingscoringapp.datavalidation.BowlingScoreValidation;
import com.tenpinbowlingscoringapp.entity.Frame;
import com.tenpinbowlingscoringapp.entity.Player;
import com.tenpinbowlingscoringapp.entity.Wrapper;

public class BowlingScoreValidationTest {

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
		wrappers.add(new Wrapper("Jhon", "5"));
		wrappers.add(new Wrapper("Jhon", "3"));
		wrappers.add(new Wrapper("Jhon", "1"));
		wrappers.add(new Wrapper("Jhon", "6"));
		wrappers.add(new Wrapper("Jhon", "2"));
		wrappers.add(new Wrapper("Jhon", "3"));
		wrappers.add(new Wrapper("Jhon", "3"));
		wrappers.add(new Wrapper("Jhon", "3"));
		wrappers.add(new Wrapper("Jhon", "3"));
		wrappers.add(new Wrapper("Jhon", "3"));
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
			Player player1 = new Player();
			player1.setName("Jhon");
			players.add(player1);
		}

		List<Wrapper> wrappers1 = new ArrayList<Wrapper>();
		wrappers1.add(new Wrapper("Jhon", "5"));
		wrappers1.add(new Wrapper("Jhon", "5"));
		wrappers1.add(new Wrapper("Jhon", "5"));
		wrappers1.add(new Wrapper("Jhon", "5"));
		wrappers1.add(new Wrapper("Jhon", "5"));
		wrappers1.add(new Wrapper("Jhon", "5"));
		wrappers1.add(new Wrapper("Jhon", "5"));
		wrappers1.add(new Wrapper("Jhon", "5"));
		wrappers1.add(new Wrapper("Jhon", "5"));
		wrappers1.add(new Wrapper("Jhon", "5"));
		wrappers1.add(new Wrapper("Jhon", "5"));
		wrappers1.add(new Wrapper("Jhon", "5"));
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
		wrappers3.add(new Wrapper("Jhon", "5"));
		wrappers3.add(new Wrapper("Jhon", "3"));
		wrappers3.add(new Wrapper("Jhon", "1"));
		wrappers3.add(new Wrapper("Jhon", "6"));
		wrappers3.add(new Wrapper("Jhon", "2"));
		wrappers3.add(new Wrapper("Jhon", "3"));
		wrappers3.add(new Wrapper("Jhon", "3"));
		wrappers3.add(new Wrapper("Jhon", "3"));
		wrappers3.add(new Wrapper("Jhon", "3"));
		wrappers3.add(new Wrapper("Jhon", "3"));
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
		wrappers4.add(new Wrapper("Jhon", "5"));
		wrappers4.add(new Wrapper("Jhon", "5"));
		wrappers4.add(new Wrapper("Jhon", "G"));
		wrappers4.add(new Wrapper("Jhon", "5"));
		wrappers4.add(new Wrapper("Jhon", "5"));
		wrappers4.add(new Wrapper("Jhon", "5"));
		wrappers4.add(new Wrapper("Jhon", "5"));
		wrappers4.add(new Wrapper("Jhon", "5"));
		wrappers4.add(new Wrapper("Jhon", "5"));
		wrappers4.add(new Wrapper("Jhon", "5"));
		wrappers4.add(new Wrapper("Jhon", "5"));
		wrappers4.add(new Wrapper("Jhon", "5"));
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
		wrappers5.add(new Wrapper("Jhon", "5"));
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
		
		List<Wrapper> wrappers6 = new ArrayList<Wrapper>();
		wrappers6.add(new Wrapper("Jhon", "5"));
		wrappers6.add(new Wrapper("Jhon", "5"));
		wrappers6.add(new Wrapper("Jhon", "12"));
		wrappers6.add(new Wrapper("Jhon", "5"));
		wrappers6.add(new Wrapper("Jhon", "5"));
		wrappers6.add(new Wrapper("Jhon", "5"));
		wrappers6.add(new Wrapper("Jhon", "5"));
		wrappers6.add(new Wrapper("Jhon", "5"));
		wrappers6.add(new Wrapper("Jhon", "5"));
		wrappers6.add(new Wrapper("Jhon", "5"));
		wrappers6.add(new Wrapper("Jhon", "5"));
		wrappers6.add(new Wrapper("Jhon", "5"));
		players6 = new ArrayList<Player>();

		List<Frame> frames6;
		for (Wrapper wrap : wrappers6) {
			frames6 = new ArrayList<Frame>();
			Player player = new Player();
			player.setName(wrap.getName());
			Frame frame = new Frame();
			frame.setFirstPinfall(wrap.getValue());
			frames6.add(frame);
			player.setFrames(frames6);
			players6.add(player);						
		}
		
		List<Wrapper> wrappers7 = new ArrayList<Wrapper>();
		wrappers7.add(new Wrapper("Jhon", "5"));
		wrappers7.add(new Wrapper("Jhon", "5"));
		wrappers7.add(new Wrapper("Jhon", "2.5"));
		wrappers7.add(new Wrapper("Jhon", "5"));
		wrappers7.add(new Wrapper("Jhon", "5"));
		wrappers7.add(new Wrapper("Jhon", "5"));
		wrappers7.add(new Wrapper("Jhon", "5"));
		wrappers7.add(new Wrapper("Jhon", "5"));
		wrappers7.add(new Wrapper("Jhon", "5"));
		wrappers7.add(new Wrapper("Jhon", "5"));
		wrappers7.add(new Wrapper("Jhon", "5"));
		wrappers7.add(new Wrapper("Jhon", "5"));
		players7 = new ArrayList<Player>();

		List<Frame> frames7;
		for (Wrapper wrap : wrappers7) {
			frames7 = new ArrayList<Frame>();
			Player player = new Player();
			player.setName(wrap.getName());
			Frame frame = new Frame();
			frame.setFirstPinfall(wrap.getValue());
			frames7.add(frame);
			player.setFrames(frames7);
			players7.add(player);						
		}
	}

	@Test
	void ValidateNullFrame() {
		String expected="Incorrect line";
		BowlingScoreValidation bs = new BowlingScoreValidation();
		String errorMessage = bs.Validate(players);
		assertEquals(expected, errorMessage);
	}
	
	@Test
	void ValidateSuccess() {
		String expected="";
		BowlingScoreValidation bs = new BowlingScoreValidation();
		String errorMessage = bs.Validate(players1);
		assertEquals(expected, errorMessage);
	}
	
	@Test
	void ValidateCountPlayer() {
		String expected="Total pinfalls incorrect";
		BowlingScoreValidation bs = new BowlingScoreValidation();
		String errorMessage = bs.Validate(players3);
		assertEquals(expected, errorMessage);
	}
	
	@Test
	void ValidatePlayerScoreValue() {
		String expected="The pinfall value, incorrect. It is not a digit or the letter F";
		BowlingScoreValidation bs = new BowlingScoreValidation();
		String errorMessage = bs.Validate(players4);
		assertEquals(expected, errorMessage);
	}
	
	@Test
	void ValidatePlayerNegativeNumber() {
		String expected="The pinfall value, incorrect. Out of range";
		BowlingScoreValidation bs = new BowlingScoreValidation();
		String errorMessage = bs.Validate(players6);
		assertEquals(expected, errorMessage);
	}
	
	@Test
	void ValidatePlayerIsNotAInteger() {
		String expected="The pinfall value, incorrect. It's not an integer";
		BowlingScoreValidation bs = new BowlingScoreValidation();
		String errorMessage = bs.Validate(players7);
		assertEquals(expected, errorMessage);
	}
	
	
}
