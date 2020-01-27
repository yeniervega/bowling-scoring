package com.tenpinbowlingscoringapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.tenpinbowlingscoringapp.entity.Player;
import com.tenpinbowlingscoringapp.useful.UsefulClass;

public class UsefulClassTest {	
	
	String[] score;
	String[] pinfall;
	
	@BeforeEach
	void preLoad() {
		score= new String[]{"Jhon	5","Mary 0","Jhon	8","Jhon	9","Jhon	10"};
		pinfall = new String [] {null,"F","0","X","/","8"};
	}
	
	class Wrapper{
		private String name;
		private String value;
		public Wrapper(String name, String value) {
			super();
			this.name = name;
			this.value = value;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}				
	}
	
	@Test
	void successCase() {		
		Player receivedPlayer;
		List<Wrapper> w=new ArrayList<Wrapper>();
		w.add(new Wrapper("Jhon", "5"));
		w.add(new Wrapper(null, null));
		w.add(new Wrapper("Jhon", "8"));
		w.add(new Wrapper("Jhon", "9"));
		w.add(new Wrapper("Jhon", "10"));
		for (int i = 0; i < score.length; i++) {
			Wrapper f=w.get(i);
			receivedPlayer=UsefulClass.getPlayer(score[i]);
			String receivedValue=receivedPlayer.getFrames()==null?null:receivedPlayer.getFrames().get(0).getFirstPinfall();
			assertEquals(f.getName(), receivedPlayer.getName());
			assertEquals(f.getValue(), receivedValue);
		}		
	}
	
	@Test
	void getPlayerTest() {
		Integer[] expected=new Integer[] {0,0,0,10,-1,8};
		for (int i = 0; i < pinfall.length; i++) {
			String string = pinfall[i];
			Integer received = UsefulClass.getRealValuePinfall(string);
			assertEquals(expected[i], received);
		}
	}
	
	


}
