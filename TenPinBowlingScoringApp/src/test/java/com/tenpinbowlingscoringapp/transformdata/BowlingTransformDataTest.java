package com.tenpinbowlingscoringapp.transformdata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.tenpinbowlingscoringapp.entity.Frame;
import com.tenpinbowlingscoringapp.entity.Player;
import com.tenpinbowlingscoringapp.entity.Wrapper;
import com.tenpinbowlingscoringapp.transformdata.BowlingTransformData;

public class BowlingTransformDataTest {
	
	
	List<Player> players;
	List<Player> players1;

	@BeforeEach
	void inital() {
		List<Wrapper> wrappers = new ArrayList<Wrapper>();
		wrappers.add(new Wrapper("Jhon", "5"));
		wrappers.add(new Wrapper("Jhon", "3"));
		wrappers.add(new Wrapper("Tom", "1"));
		wrappers.add(new Wrapper("Mary", "6"));
		wrappers.add(new Wrapper("Tom", "2"));
		wrappers.add(new Wrapper("Mary", "3"));
		players=new ArrayList<Player>();

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
		wrappers1.add(new Wrapper("Jhon", "5"));
		wrappers1.add(new Wrapper("", null));
		wrappers1.add(new Wrapper("Tom", "1"));
		wrappers1.add(new Wrapper("Mary", "6"));
		wrappers1.add(new Wrapper("Tom", "2"));
		wrappers1.add(new Wrapper("Mary", "3"));
		wrappers1.add(new Wrapper("", "5"));
		wrappers1.add(new Wrapper("Jhon", "1"));
		players1=new ArrayList<Player>();

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
	}

	@Test
	void groupPinfall() {
		BowlingTransformData bd=new BowlingTransformData();
		Stream<Player> sp=players.stream();
		Map<String, List<Player>> groupingPlayers=bd.groupPinfall(sp);
		
		List<Wrapper> wrappers = new ArrayList<Wrapper>();
		wrappers.add(new Wrapper("Jhon", "5", "3"));
		wrappers.add(new Wrapper("Tom", "1","2"));
		wrappers.add(new Wrapper("Mary", "6","3"));
		
		Integer count=0;
		for (Map.Entry<String, List<Player>> auxiliary : groupingPlayers.entrySet()) {
			Wrapper w= wrappers.get(count);
			assertEquals(w.getName(), auxiliary.getKey());
			assertEquals(w.getValue(), auxiliary.getValue().get(0).getFrames().get(0).getFirstPinfall());
			assertEquals(w.getSecondvalue(), auxiliary.getValue().get(1).getFrames().get(0).getFirstPinfall());
			count++;
		}	
	}
	
	@Test
	void groupPinfallwithNull() {
		BowlingTransformData bd=new BowlingTransformData();
		Stream<Player> sp=players1.stream();
		Map<String, List<Player>> groupingPlayers=bd.groupPinfall(sp);
		
		List<Wrapper> wrappers = new ArrayList<Wrapper>();
		wrappers.add(new Wrapper("Jhon", "5", "1"));
		wrappers.add(new Wrapper("", null, "5"));
		wrappers.add(new Wrapper("Tom", "1","2"));
		wrappers.add(new Wrapper("Mary", "6","3"));		
		
		Integer count=0;
		for (Map.Entry<String, List<Player>> auxiliary : groupingPlayers.entrySet()) {
			Wrapper w= wrappers.get(count);
			assertEquals(w.getName(), auxiliary.getKey());
			assertEquals(w.getValue(), auxiliary.getValue().get(0).getFrames()==null?null: auxiliary.getValue().get(0).getFrames().get(0).getFirstPinfall());
			assertEquals(w.getSecondvalue(), auxiliary.getValue().get(1).getFrames()==null?null:auxiliary.getValue().get(1).getFrames().get(0).getFirstPinfall());
			count++;
		}	
	}
}
