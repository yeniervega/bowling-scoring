package com.tenpinbowlingscoringapp.useful;

import java.util.ArrayList;
import java.util.List;
import com.tenpinbowlingscoringapp.entity.Frame;
import com.tenpinbowlingscoringapp.entity.Player;

public class UsefulClass {

	public static Integer getRealValuePinfall(String valueToTransform) {
		Integer rearValuePinfall = 0;
		if (valueToTransform != null) {
			rearValuePinfall = valueToTransform == null || valueToTransform.toUpperCase().equals("F") 
					|| valueToTransform == "0" ? 0
							: valueToTransform == "X" ? 10
									: valueToTransform == "/" ? -1 : Integer.parseInt(valueToTransform);
		}
		return rearValuePinfall;
	}

	public static Player getPlayer(String line) {
		String[] auxiliar = line.split("\t");
		Player player = new Player();
		if (auxiliar != null && auxiliar.length == 2) {
			player.setName(auxiliar[0]);
			Frame frame = new Frame();
			frame.setFirstPinfall(auxiliar[1]);
			List<Frame> frameList = new ArrayList<Frame>();
			frameList.add(frame);
			player.setFrames(frameList);
		}
		else
		{
			player.setName("");
		}		
		return player;
	}
	
	public static Integer getPinfallsSummationPerFrame(Frame frame) {
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
